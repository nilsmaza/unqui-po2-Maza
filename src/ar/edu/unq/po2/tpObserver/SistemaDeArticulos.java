package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;

public class SistemaDeArticulos extends Observable {

	private ArrayList<Articulo> articulos = new ArrayList<Articulo>();
	
	public void agregarArticulo(Articulo nuevoArticulo) {
		articulos.add(nuevoArticulo);
		this.notify(nuevoArticulo);
		
	}
}
