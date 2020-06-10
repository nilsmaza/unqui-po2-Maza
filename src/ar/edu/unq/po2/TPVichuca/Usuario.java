package ar.edu.unq.po2.TPVichuca;

public class Usuario {
	
	private int idUser;
	private Ubicacion ubicacion;
	private IConocimiento conocimiento;
	
	public Usuario(int idUser, Ubicacion ubicacion) {
		super();
		this.idUser = idUser;
		this.ubicacion = ubicacion;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
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
	
	public String tipoDeConocimiento() {
		return conocimiento.getTipoDeConocimiento();
	}

	public void setConocimiento(IConocimiento conocimiento) {
		this.conocimiento = conocimiento;
	}
	
	public void enviarMuestra(Historial historial,Muestra muestra) {
		historial.agregarMuestra(muestra);
	}
	
	public void opinarSobreLaMuestra(Muestra muestra,Opinion opinion) {
		this.getConocimiento().valorarMuestra(this, muestra, opinion);
	}
	
//	public void recibirEvaluacionDeConocimiento(Historial historial,Usuario user) {
//		historial.getEvaluador().reCalificacionDe(this, historial);
//	}

}
