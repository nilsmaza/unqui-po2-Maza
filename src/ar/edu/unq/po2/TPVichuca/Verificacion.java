package ar.edu.unq.po2.TPVichuca;

import java.util.ArrayList;

public abstract class Verificacion {
	
	private boolean verificado;
	
	public Verificacion(boolean valorDeVerdad) {
		super();
		this.verificado = valorDeVerdad;
	}
	
	public boolean isVerificado() {
		return verificado;
	}

	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}

	public abstract void verificar(Muestra muestra);
	public abstract ArrayList<Opinion> OpinionesDeUsuarios(Muestra muestra);
	public abstract boolean puedeOpinarSobreLa(Muestra muestra);
	public abstract Opinion opinionActual(Muestra muestra);
	
}
