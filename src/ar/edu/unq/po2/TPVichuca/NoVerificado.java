package ar.edu.unq.po2.TPVichuca;


public class NoVerificado extends Estado{

	public Opinion opinionActual(Muestra muestra) {
		int contadorDeRespuestas = 1;
		RespuestaNoDefinida respuesta = new RespuestaNoDefinida();
		Opinion opinionActual = new Opinion(muestra.getUser(),respuesta);
			for(Opinion opinion : muestra.getOpiniones()){
				if(contadorDeRespuestas < muestra.cantidadDeVecesQueApareceLa(opinion)) {
					contadorDeRespuestas = muestra.cantidadDeVecesQueApareceLa(opinion);
					opinionActual = opinion;
				}
			}
	return opinionActual;
	}
	
	public void verificar(Muestra muestra) {
		if(muestra.opinaronTodosBasicos()) {
			Estado estado = new verificacionParcial();
			muestra.getVerificado().setVerificado(estado);
		}else{
			if(muestra.opinaronExpertos()) {
				Estado estado2 = new VerificadoParcialExperto();
				muestra.getVerificado().setVerificado(estado2);
			}
		}
	}


	@Override
	public boolean puedeOpinarSobreLa(Usuario user, Muestra muestra) {
		return muestra.cantidadDeVecesApareceEl(user) == 0;
	}

	@Override
	public boolean yaEstaVerifacado() {
		return false;
	}

	
}
