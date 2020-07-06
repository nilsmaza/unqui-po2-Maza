package ar.edu.unq.po2.tpComposite;

import java.util.ArrayList;

public class IShapeShifter extends ShapeShifte{ //composite
	
	private ArrayList<ShapeShifte> listaDe = new ArrayList<ShapeShifte>();
	
	public ArrayList<ShapeShifte> getListaDe() {
		return listaDe;
	}

	public void setListaDeNumeros(ArrayList<ShapeShifte> listaDe) {
		this.listaDe = listaDe;
	}

	public IShapeShifter(ArrayList<ShapeShifte> listaDe) {
		super();
		this.listaDe = listaDe;
	}

	public int profundidad(){
		return 1;
	}
	
	@Override
	public int deepest() {
		int profundidadActual = 0;
			for(ShapeShifte shape : this.getListaDe()) {
				profundidadActual += shape.deepest() + shape.profundidad();	
			}
		return profundidadActual;
	}
	
	public ArrayList<ShapeShifte> desarmadoDeShape() {
		ArrayList<ShapeShifte> listaDe = new ArrayList<ShapeShifte>();
			for(ShapeShifte shape : this.getListaDe()) {
				if(shape.deepest() < 1) {
					listaDe.add(shape);
				}else {
					for(ShapeShifte shape2 : shape.desarmadoDeShape()) {
						listaDe.add(shape2);
					}
				}
			}
		return listaDe;
	}
	
	public IShapeShifter flat() {
		IShapeShifter nuevoShape;
			nuevoShape = new IShapeShifter(this.desarmadoDeShape());
		return nuevoShape;
	}
	
	public ArrayList<Integer> values() {
		return this.listaDeNumeros();
	}

	public ArrayList<Integer> listaDeNumeros() {
		ArrayList<Integer> listaDeEnteros = new ArrayList<Integer>();
		for(ShapeShifte shape : this.desarmadoDeShape()) {
			listaDeEnteros.add(shape.numero());
		}
		return listaDeEnteros;
	}


	public Integer numero() {
		return null;
	}
	@Override
	public IShapeShifte compose(IShapeShifte shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
