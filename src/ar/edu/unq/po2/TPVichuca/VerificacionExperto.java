package ar.edu.unq.po2.TPVichuca;

import java.util.ArrayList;

public class VerificacionExperto extends Verificacion{
	


	public VerificacionExperto(boolean valorDeVerdad) {
		super(valorDeVerdad);
	}

	public ArrayList<Opinion> OpinionesDeUsuarios(Muestra muestra) {
		 ArrayList<Opinion> opiniones = new  ArrayList<Opinion>();
		 	for(Opinion respueta : muestra.getOpiniones()){
		 		if(respueta.getUser().getConocimiento().getTipoDeConocimiento() == "Experto") {
		 			opiniones.add(respueta);
		 		}
		 	}
		 return opiniones;
	}
	
	public Opinion opinionActual(Muestra muestra) {
		Integer contadorDeRespuestas = 0;
		Opinion opinionActual = new Opinion(muestra.getUser(),new RespuestaNoDefinida());
			for(Opinion opinion : this.OpinionesDeUsuarios(muestra) ){
				if(contadorDeRespuestas < muestra.cantidadDeVecesQueApareceLa(opinion)) {
					contadorDeRespuestas = muestra.cantidadDeVecesQueApareceLa(opinion);
					opinionActual = opinion;
				}
			}
		return opinionActual;
	}

	public boolean puedeOpinarSobreLa(Muestra muestra) {
		return  muestra.getVerificado().isVerificado();
	}
	
	public void verificar(Muestra muestra) {
		 if(this.masDe2votoPorUnaOpinion(muestra)) {
			 muestra.setVerificado(new VerificacionExperto(true));
		 }
	}
	
	public boolean masDe2votoPorUnaOpinion(Muestra muestra) {
		Opinion opinionActual = this.opinionActual(muestra);
		Integer contador = 0;
			for(Opinion opinion : this.OpinionesDeUsuarios(muestra)) {
				if(opinionActual == opinion) {
					contador += 1;
				}
			}
		return contador > 2;
	}

}
