package ar.edu.unq.po2.tpObserver2;

import java.util.ArrayList;

public class InteresPorDeporte extends Interes{
	
	private ArrayList<String> deportesDeInteres = new ArrayList<String>();
	
	public InteresPorDeporte(AppMovil aplicacion){
		super(aplicacion);
	}

	public boolean esDeInteres(Partido partido){
		String deporte = partido.getDeporte();
		return deportesDeInteres.contains(deporte);
	}
	
	public void agregarDeporte(String deporte){
		deportesDeInteres.add(deporte);
	}
	
	public void eliminarDeporte(String deporte){
		deportesDeInteres.remove(deporte);
	}

}
