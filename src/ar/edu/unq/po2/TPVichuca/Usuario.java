package ar.edu.unq.po2.TPVichuca;

public class Usuario {
	
	private Integer idUser;
	private Ubicacion ubicacion;
	private IConocimiento conocimiento;
	
	public Usuario(Integer idUser, Ubicacion ubicacion, IConocimiento conocimiento) {
		super();
		this.idUser = idUser;
		this.ubicacion = ubicacion;
		this.conocimiento = conocimiento;
	}
	
	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public IConocimiento getConocimiento() {
		return conocimiento;
	}

	public void setConocimiento(IConocimiento conocimiento) {
		this.conocimiento = conocimiento;
	}
	
	public void enviarMuestra(Historial historial,Muestra muestra) {
		historial.agregarMuestra(muestra);
	}
	
	public void opinarSobreLaMuestra(Usuario user,Muestra muestra,Opinion opinion) {
		this.getConocimiento().valorarMuestra(this, muestra, opinion);
	}
	
	public void recibirEvaluacionDeConocimiento(Historial historial,Usuario user) {
		historial.getEvaluador().cambiarConocimiento(historial, this);
	}

}
