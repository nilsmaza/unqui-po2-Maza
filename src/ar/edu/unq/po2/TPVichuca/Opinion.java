package ar.edu.unq.po2.TPVichuca;

import java.util.Calendar;

public class Opinion {

	private Usuario user;
	private Calendar fechaEnviada = Calendar.getInstance();
	private IClasificacion respuesta;

	public Opinion(Usuario user, IClasificacion respuesta) {
		super();
		this.user = user;
		this.setRespuesta(respuesta);
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
	
	public IClasificacion getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(IClasificacion respuesta) {
		this.respuesta = respuesta;
	}
	
	public String nombreDelInsecto(){ 
		return this.getRespuesta().nombreDelInsectoORespuesta();
	}

}
