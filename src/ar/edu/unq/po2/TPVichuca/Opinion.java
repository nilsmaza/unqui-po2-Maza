package ar.edu.unq.po2.TPVichuca;

import java.util.Calendar;

public class Opinion {

	private Usuario user;
	private Calendar fechaEnviada;

	public Opinion(Usuario user) {
		super();
		this.user = user;
	}
	
	public Calendar getFechaEnviada() {
		return fechaEnviada;
	}

	public void setFechaEnviada(Calendar fechaEnviada) {
		this.fechaEnviada = fechaEnviada;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
	public String nombreDelInsecto(){ // verificar
		return "";
	}
	
}
