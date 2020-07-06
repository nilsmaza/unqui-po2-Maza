package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;

public abstract class Observable {

	private ArrayList<IObserver> observadores = new ArrayList<IObserver>();

	public void agregarObserver(IObserver obs) {
		if(!observadores.contains(obs))
		observadores.add(obs);
	}
	public void removerObserver(IObserver obs) {
		observadores.remove(obs);
	}
	public void notify(Articulo articulo) {
		for(IObserver obs :observadores) {
			obs.update(articulo);
		}
	}
	public ArrayList<IObserver> getObservadores(){
		return this.observadores;
	}
	
}
