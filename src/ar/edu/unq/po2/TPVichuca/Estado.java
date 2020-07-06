package ar.edu.unq.po2.TPVichuca;


public abstract class Estado {

	public abstract void verificar(Muestra muestra);
	public abstract boolean puedeOpinarSobreLa(Usuario user ,Muestra muestra);
	public abstract Opinion opinionActual(Muestra muestra);
	public abstract boolean yaEstaVerifacado();

	
}
