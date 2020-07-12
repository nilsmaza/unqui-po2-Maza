package ar.edu.unq.po2.tpObserver2;

import java.util.ArrayList;

public class Servidor extends ServidorObservable{ // IObserver = Deportes Actualizacion

	private ArrayList<Deporte> deportes = new ArrayList<Deporte>();
	private ArrayList<Partido> partidos = new ArrayList<Partido>();

	public Servidor() {
		super();
	}

	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
		this.notify(partido);
	}

	public void subscribirseADeporte(Deporte deporte) {
		this.deportes.add(deporte);
		deporte.agregarServidor(this);
	}
	

	public void eliminarDeporte(Deporte deporte) {
		this.deportes.remove(deporte);
		deporte.eliminarServidor(this);
	}

	
	public void updateServidores(Partido partido) {
		agregarPartido(partido);
	}

}
