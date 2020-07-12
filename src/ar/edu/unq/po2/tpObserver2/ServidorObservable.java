package ar.edu.unq.po2.tpObserver2;

import java.util.ArrayList;

public abstract class ServidorObservable {
	
	private ArrayList<IObserver> observadores = new ArrayList<IObserver>();

	public void agregarObserver(IObserver obs) { //app moviles
		if(!observadores.contains(obs))
		observadores.add(obs);
	}
	public void removerObserver(IObserver obs) {
		observadores.remove(obs);
	}
	public void notify(Partido partido) {
		for (IObserver aplicacionActual : observadores) {
			if (aplicacionActual.interesadoEn(partido)) {
				aplicacionActual.update(partido);
			}
		}	
	}
	
	public abstract void updateServidores(Partido partido);
	
	public ArrayList<IObserver> getObservadores(){
		return this.observadores;
	}
	

}
