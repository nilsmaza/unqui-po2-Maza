package ar.edu.unq.po2.tpObserver2;

import java.util.ArrayList;

public class AppMovil implements IObserver {
	
	private ArrayList<Interes> intereses = new ArrayList<Interes>();
	
	public AppMovil() {
		super();
	}
	
	public void suscribirseAServidor(Servidor servidor) {
		servidor.agregarObserver(this);
	}
	
	public void agregarInteres(Interes interes) {
		intereses.add(interes);
	}

	public void eliminarInteres(Interes interes) {
		intereses.remove(interes);
	}
	
	public boolean interesadoEn(Partido partido) {
		boolean interesado = false;
		for (Interes interesActual : intereses) {
			interesado = interesado || interesActual.esDeInteres(partido);
		}
		return interesado;
	}
	
	@Override
	public void update(Partido partido) {
		System.out.println("nuevo Partido que te puede interesar");
	}
	
}
