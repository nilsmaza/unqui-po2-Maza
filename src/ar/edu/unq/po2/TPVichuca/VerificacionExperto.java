package ar.edu.unq.po2.TPVichuca;

import java.util.ArrayList;

public class VerificacionExperto extends Verificacion{
	
	public VerificacionExperto() {
		super();
	}

	public ArrayList<Opinion> OpinionesDeUsuarios(Muestra muestra) {
		 ArrayList<Opinion> opiniones = new  ArrayList<Opinion>();
		 	for(Opinion respueta : muestra.getOpiniones()){
		 		if(respueta.getUser().tipoDeConocimiento() == "Experto") {
		 			opiniones.add(respueta);
		 		}
		 	}
		 return opiniones;
	}
	
	public Opinion opinionActual(Muestra muestra) {
		int contadorDeRespuestas = 1;
		RespuestaNoDefinida respuesta = new RespuestaNoDefinida();
		Opinion opinionActual = new Opinion(muestra.getUser(),respuesta);
			for(Opinion opinion : this.OpinionesDeUsuarios(muestra) ){
				if(contadorDeRespuestas < muestra.cantidadDeVecesQueApareceLa(opinion)) {
					contadorDeRespuestas = muestra.cantidadDeVecesQueApareceLa(opinion);
					opinionActual = opinion;
				}
			}
		return opinionActual;
	}

	public boolean puedeOpinarSobreLa(Usuario user , Muestra muestra) {
		return  !muestra.isMuestraVerificada() && 
				muestra.cantidadDeVecesApareceEl(user) == 0
				&& user.tipoDeConocimiento() == "Experto";
	}
	
	public void verificar(Muestra muestra) {
		 if(this.masDe2votoPorUnaOpinion(muestra)) {
			 muestra.getVerificado().setVerificado(true);
		 }
	}
	
	public boolean masDe2votoPorUnaOpinion(Muestra muestra) {
		Opinion opinionActual = this.opinionActual(muestra);
		int contador = 0;
			for(Opinion opinion : this.OpinionesDeUsuarios(muestra)) {
				if(opinionActual.nombreDelInsecto() == opinion.nombreDelInsecto()) {
					contador += 1;
				}
			}
		return contador > 1;
	}

}
