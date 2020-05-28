package ar.edu.unq.po2.TPVichuca;

import java.util.ArrayList;

public class VerificacionExperto extends Verificacion{

	@Override
	public Opinion verificar() {
		// TODO Auto-generated method stub
		return null;
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
		Opinion opinionActual = null;
			for(Opinion opinion : this.OpinionesDeUsuarios(muestra) ){
				if(contadorDeRespuestas < muestra.cantidadDeVecesQueApareceLa(opinion)) {
					contadorDeRespuestas = muestra.cantidadDeVecesQueApareceLa(opinion);
					opinionActual = opinion;
				}
			}
		return opinionActual;
	}
	
//	public boolean puedeVerificarse(Muestra muestra) {
//		return  && muestra.verificada(); <== ver
//	}

}
