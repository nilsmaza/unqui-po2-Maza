package ar.edu.unq.po2.TPVichuca;


public class verificacionParcial extends Estado {
	

	public Opinion opinionActual(Muestra muestra) {
		int contadorDeRespuestas = 0;
		RespuestaNoDefinida respuesta = new RespuestaNoDefinida();
		Opinion opinionActual = new Opinion(null,respuesta);
			for(Opinion opinion : muestra.getOpiniones()){
				if(contadorDeRespuestas < muestra.cantidadDeVecesQueApareceLa(opinion)) {
					contadorDeRespuestas = muestra.cantidadDeVecesQueApareceLa(opinion);
					opinionActual = opinion;
				}
			}
	return opinionActual;
	}
	
	
	public void verificar(Muestra muestra) {
		Estado estado = new VerificadoParcialExperto();
			if(!muestra.opinaronTodosBasicos()) {
				muestra.getVerificado().setVerificado(estado);
			}
	}


	@Override
	public boolean puedeOpinarSobreLa(Usuario user, Muestra muestra) {
		return /*!muestra.opinaronExpertos() && */!muestra.isMuestraVerificada() &&
				muestra.cantidadDeVecesApareceEl(user) == 0;
	}

	@Override
	public boolean yaEstaVerifacado() {
		return false;
	}

}
