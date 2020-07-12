package ar.edu.unq.po2.tpComposite2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ShapeShifte implements IShapeShifter{
	

	
	private ArrayList<IShapeShifter> listaDeShapeShifte = new ArrayList<IShapeShifter>();
	private int valor;
	
	public ShapeShifte(int valor) {
		super();
		this.valor = valor;
	}
	
	public ArrayList<IShapeShifter> getListaDeShapeShifte() {
		return listaDeShapeShifte;
	}
	
	@Override
	public int deepest() {
		Integer profundidad = 0;
		if (!this.listaDeShapeShifte.isEmpty()) {
			profundidad =+ 1;
			ArrayList<Integer> profundidades = (ArrayList<Integer>) listaDeShapeShifte.stream().map(iShapeShifter -> iShapeShifter.deepest()).collect(Collectors.toList());
			int profundidadMayor = Collections.max(profundidades);
			profundidad = profundidad + profundidadMayor;
		}
		return profundidad;
	}

	@Override
	public IShapeShifter flat() {
		if (this.deepest() > 1) {
			ArrayList<IShapeShifter> shapeShifters = new ArrayList<IShapeShifter>();
			for (Integer value : this.values()) {
				shapeShifters.add(new ShapeShifte(value));
			}
			listaDeShapeShifte = shapeShifters;
		}
		return this;
	}

	@Override
	public ArrayList<Integer> values() {
		ArrayList<Integer> listaDeValores = new ArrayList<Integer>();
		if (this.deepest() == 0) {
			listaDeValores.add(this.valor);
		}else {
			for (IShapeShifter iShapeShifter : listaDeShapeShifte) {
				listaDeValores.addAll(iShapeShifter.values());
			}
		}
		return listaDeValores;
	}
	
	public ShapeShifte(IShapeShifter ShapeShifter1, IShapeShifter ShapeShifter2) { // 2do constructor
		this.listaDeShapeShifte.add(ShapeShifter1);
		this.listaDeShapeShifte.add(ShapeShifter2);
	}

	@Override
	public ShapeShifte compose(IShapeShifter shapeShifter) {
		return new ShapeShifte(this, shapeShifter);
	}
}
