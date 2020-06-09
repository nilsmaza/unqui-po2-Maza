package ar.edu.unq.po2.TPVichuca;

import java.time.LocalDate;


public class Opinion {

	private Usuario user;
	private LocalDate fechaEnviada = LocalDate.now();
	private IClasificacion respuesta;
	private String hechoPorUn;

	public Opinion(Usuario user, IClasificacion respuesta) {
		super();
		this.user = user;
		this.setRespuesta(respuesta);
//		this.settipoDeConocimientoAlaHoraDeOpinar(user.getConocimiento().getTipoDeConocimiento());
	}
	
	public LocalDate getFechaEnviada() {
		return fechaEnviada;
	}

	public void setFechaEnviada(LocalDate fechaEnviada) {
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
	
	public String tipoDeConocimientoAlaHoraDeOpinar() {
		return hechoPorUn;
	}
	public void settipoDeConocimientoAlaHoraDeOpinar(String tipoDeConocimiento) {
		this.hechoPorUn = tipoDeConocimiento;
	}
	
	public String nombreDelInsecto(){ 
		return this.getRespuesta().nombreDelInsectoORespuesta();
	}

}
