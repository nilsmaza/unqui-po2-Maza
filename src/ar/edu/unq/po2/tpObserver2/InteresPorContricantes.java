package ar.edu.unq.po2.tpObserver2;

import java.util.ArrayList;

public class InteresPorContricantes extends Interes{
	
	private ArrayList<String> contrincantesDeInteres = new ArrayList<String>() ;

	public InteresPorContricantes(AppMovil aplicacion) {
		super(aplicacion);
	}

	@Override
	public boolean esDeInteres(Partido partido) {
		boolean esDeInteres = false;
			for (String contrincante : contrincantesDeInteres) {
				esDeInteres = esDeInteres || partido.contrincanteEnLaLista(contrincante);
			}
		return esDeInteres;
	}
	
	public void agregarContrincante(String contrincante) {
		contrincantesDeInteres.add(contrincante);
	}

	public void eliminarContrincante(String contrincante) {
		contrincantesDeInteres.remove(contrincante);
	}
	
}
