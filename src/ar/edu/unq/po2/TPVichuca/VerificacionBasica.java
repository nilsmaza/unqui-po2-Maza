package ar.edu.unq.po2.TPVichuca;

import java.util.ArrayList;

public class VerificacionBasica {
	
	private String verTipo = "Basico";
	
	public VerificacionBasica() {
		super();
	}

	public ArrayList<Opinion> OpinionesDeUsuarios(Muestra muestra){
		 ArrayList<Opinion> opiniones = new  ArrayList<Opinion>();
		 	for(Opinion respueta : muestra.getOpiniones()){
		 		if(respueta.getUser().tipoDeConocimiento() == "Basico") {
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
	
	public boolean puedeOpinarSobreLa(Usuario user,Muestra muestra){
		return !muestra.opinaronExpertos() && !muestra.isMuestraVerificada()
				&& muestra.cantidadDeVecesApareceEl(user) == 0;
	}

	@Override
	public void verificar(Muestra muestra) {
		if(muestra.opinaronBasicos()) {
		muestra.getVerificado().setVerificado("VerificadaParcialmente");
		}
	}

	public String getVerTipo() {
		return verTipo;
	}

	public void setVerTipo(String verTipo) {
		this.verTipo = verTipo;
	}

	


}
