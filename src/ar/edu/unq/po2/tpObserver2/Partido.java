package ar.edu.unq.po2.tpObserver2;

import java.util.ArrayList;

public class Partido {
	
	private String deporte;
	private ArrayList<String> contrincantes = new ArrayList<String>();
	private String resultado;
	
	public Partido(String deporte, String resultado) {
		this.deporte = deporte;
		this.resultado = resultado;
	}

	
	public String getDeporte() {
		return deporte;
	}
	
	public boolean contrincanteEnLaLista(String contrincante) {
		return contrincantes.contains(contrincante);
	}
	
	public String getResultado() {
		return resultado;
	}
	
}
