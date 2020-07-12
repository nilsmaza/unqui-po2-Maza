package ar.edu.unq.po2.tpObserver2;

public abstract class Interes {
	
	private AppMovil aplicacionMovil;
	
	public Interes(AppMovil aplicacion) {
		this.aplicacionMovil = aplicacion;
		aplicacionMovil.agregarInteres(this);
	}
	
	public abstract boolean esDeInteres(Partido partido);
	
}
