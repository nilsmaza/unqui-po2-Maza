package ar.edu.unq.po2.TPVichuca;

public class Verificacion {
	
	private Estado verificado = new NoVerificado();//NoVerificado
	
	public Verificacion() {
		super();
	}
	
	public Estado getVerificado() {
		return verificado;
	}


	public void setVerificado(Estado verificado) {
		this.verificado = verificado;
	}

	
	public void verificar(Muestra muestra) {
		this.getVerificado().verificar(muestra);
	}
	
	public Opinion opinionActual(Muestra muestra) {
		return this.getVerificado().opinionActual(muestra);
	}

	public boolean muestraYaVerificada() {
		return this.getVerificado().yaEstaVerifacado();
	}

}
