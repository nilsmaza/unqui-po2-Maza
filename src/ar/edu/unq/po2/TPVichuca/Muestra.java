package ar.edu.unq.po2.TPVichuca;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Calendar;

public class Muestra {
	
	private Usuario user;
	private BufferedImage fotoDelInsecto;
	private Calendar fechaCreada;
	private Verificacion verificado;
	private ArrayList<Opinion> listaDeOpiniones;
	

	public Usuario getUser() {
		return user;
	}
	
	public ArrayList<Opinion> getOpiniones(){
		return listaDeOpiniones;
	}
	
	public Calendar getFechaCreada() {
		return fechaCreada;
	}

	public void setFechaCreada(Calendar fechaCreada) {
		this.fechaCreada = fechaCreada;
	}
	public Verificacion getVerificado() {
		return verificado;
	}

	public void setVerificado(Verificacion verificado) {
		this.verificado = verificado;
	}
	
	public Opinion opinionActual() {
		return this.getVerificado().opinionActual(this);
	}
	
/*	public Opinion opinionActual() {
		Integer contadorDeRespuestas = 0;
		Opinion opinionActual = null;
			for(Opinion opinion : this.getOpiniones() ){
				if(contadorDeRespuestas < this.cantidadDeVecesQueApareceLa(opinion)) {
					contadorDeRespuestas = this.cantidadDeVecesQueApareceLa(opinion);
					opinionActual = opinion;
				}
			}
	return opinionActual;
	}
*/	
	public Integer cantidadDeVecesQueApareceLa(Opinion opinion) {
		Integer contador = 0;
			for(Opinion opinionActual : listaDeOpiniones) {
				if(opinionActual.nombreDelInsecto() == opinion.nombreDelInsecto()) {
					contador += 1;
				}
			}
		return contador;
	}
	
	public Integer cantidadDeVecesEL(Usuario user) {
		Integer contador = 0;
			for(Opinion opinion : listaDeOpiniones) {
				if(user == opinion.getUser()) {
					contador += 1;
				}
			}
		return contador;
	}
	
	public ArrayList<Opinion> listaDeOpinionesDe(Usuario user){
		ArrayList<Opinion> OpinionesDe = new ArrayList<Opinion>();
		 	for(Opinion respueta : this.getOpiniones()){
		 		if(respueta.getUser() == user) {
		 			OpinionesDe.add(respueta);
		 		}
		 	}
		 return OpinionesDe ;
	}
	
	public Integer cantidadDeExpertosQueOpinaron(){
		Integer contador = 0;
		 	for(Opinion respueta : this.getOpiniones()){
		 		if(respueta.getUser().getConocimiento().getTipoDeConocimiento() == "Experto") {
		 			contador += 1;
		 		}
		 	}
		 return contador;
	}



}
