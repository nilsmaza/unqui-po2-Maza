package ar.edu.unq.po2.TPVichuca;

public class EvaluadorDeConocimiento2 {
	
	private Usuario user;

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
	public boolean esExperto(Historial historial,Usuario user) {
		return historial.muestrasHace30DiasDe(user).size() > 10 &&
				historial.opinionesHace30DiasDe(user).size() > 20;
	}
	
	public void reCalificacionDe(Usuario user,Historial historial) {
		if(this.esExperto(historial, user)) {
			user.setConocimiento(new ConocimientoExperto());
		}
	}

}
