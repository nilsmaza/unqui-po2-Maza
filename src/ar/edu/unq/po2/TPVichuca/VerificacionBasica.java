package ar.edu.unq.po2.TPVichuca;

import java.util.ArrayList;

public class VerificacionBasica extends Verificacion{
	

	public VerificacionBasica(boolean valorDeVerdad) {
		super(valorDeVerdad);
	}

	public ArrayList<Opinion> OpinionesDeUsuarios(Muestra muestra){
		 ArrayList<Opinion> opiniones = new  ArrayList<Opinion>();
		 	for(Opinion respueta : muestra.getOpiniones()){
		 		if(respueta.getUser().getConocimiento().getTipoDeConocimiento() == "Basico") {
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
	
	public boolean puedeOpinarSobreLa(Muestra muestra){
		return muestra.cantidadDeExpertosQueOpinaron() > 1 && !muestra.getVerificado().isVerificado();
	}

	@Override
	public void verificar(Muestra muestra) {
		muestra.setVerificado(new VerificacionBasica(false));
		
	}

}
