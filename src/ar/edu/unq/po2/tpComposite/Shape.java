package ar.edu.unq.po2.tpComposite;

import java.util.ArrayList;

public class Shape extends ShapeShifte {
	
	private Integer numero;
	
	public Shape(Integer numero) {
		super();
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public int profundidad(){
		return 0;
	}

	public int deepest() {
		return this.profundidad();
	}
	
	public ShapeShifte flat() {
		return this;
	}
	
	public ArrayList<Integer> values() {
		ArrayList<Integer> listaDeEnteros = new ArrayList<Integer>();
			listaDeEnteros.add(this.getNumero());
		return listaDeEnteros;
	}

	@Override
	public IShapeShifte compose(IShapeShifte shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ShapeShifte> desarmadoDeShape() {
		ArrayList<ShapeShifte> listaDe = new ArrayList<ShapeShifte>();
		listaDe.add(this);
		return listaDe;
	}
	
	public Integer numero() {
		return this.getNumero();
	}


}
