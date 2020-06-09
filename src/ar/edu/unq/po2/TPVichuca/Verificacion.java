package ar.edu.unq.po2.TPVichuca;

import java.util.ArrayList;

public abstract class Verificacion {
	
	private boolean verificado = false;
	
	public Verificacion() {
		super();
	}
	
	public boolean isVerificado() {
		return verificado;
	}

	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}
	
	public void cambiarTipoDeVerificacion(Muestra muestra) {
		VerificacionExperto experto = new VerificacionExperto();
		if(muestra.cantidadDeExpertosQueOpinaron() > 1 ) {
			muestra.setVerificado(experto);
		}
	}
	
	public abstract void verificar(Muestra muestra);
	public abstract ArrayList<Opinion> OpinionesDeUsuarios(Muestra muestra);
	public abstract boolean puedeOpinarSobreLa(Usuario user ,Muestra muestra);
	public abstract Opinion opinionActual(Muestra muestra);
	
	
}
