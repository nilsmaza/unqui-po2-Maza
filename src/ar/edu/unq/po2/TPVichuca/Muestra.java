package ar.edu.unq.po2.TPVichuca;

import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.util.ArrayList;

public class Muestra {
	
	private Usuario user;
	private BufferedImage fotoDelInsecto;
	private Ubicacion ubicacion;
	private LocalDate fechaCreada;
	private Verificacion verificado = new Verificacion();
	private ArrayList<Opinion> listaDeOpiniones = new ArrayList<Opinion>();
	
	
	
	public Muestra(Usuario user, BufferedImage fotoDelInsecto, Ubicacion ubicacion,Opinion opinion) {
		super();
		this.user = user;
		this.fotoDelInsecto = fotoDelInsecto;
		this.ubicacion = ubicacion;
		this.fechaCreada = LocalDate.now();
		this.listaDeOpiniones.add(opinion);
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public BufferedImage getFotoDelInsecto() {
		return fotoDelInsecto;
	}

	public void setFotoDelInsecto(BufferedImage fotoDelInsecto) {
		this.fotoDelInsecto = fotoDelInsecto;
	}

	public Usuario getUser() {
		return user;
	}
	
	public ArrayList<Opinion> getOpiniones(){
		return listaDeOpiniones;
	}
	
	public LocalDate getFechaCreada() {
		return fechaCreada;
	}

	public void setFechaCreada(LocalDate fechaCreada) {
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

	public int cantidadDeVecesQueApareceLa(Opinion opinion) {
		int contador = 0;
			for(Opinion opinionActual : listaDeOpiniones) {
				if(opinionActual.nombreDelInsecto() == opinion.nombreDelInsecto()) {
					contador += 1;
				}
			}
		return contador;
	}
	
	public int cantidadDeVecesApareceEl(Usuario user) {
		int contador = 0;
			for(Opinion opinion : listaDeOpiniones) {
				if(user.getIdUser() == opinion.getUser().getIdUser()) {
					contador += 1;
				}
			}
		return contador;
	}
	
	public Opinion OpinionDe(Usuario user){
		Opinion respuestaActual = null;
		 	for(Opinion respuesta : this.getOpiniones()){
		 		if(respuesta.getUser().getIdUser() == user.getIdUser()) {
					respuestaActual = respuesta;
	 				}
		 	}
		 return respuestaActual;
	}
	
	public int cantidadDeExpertosQueOpinaron(){
		int contador = 0;
		 	for(Opinion respueta : this.getOpiniones()){
		 		if(respueta.tipoDeConocimientoAlaHoraDeOpinar() == "Experto") {
		 			contador += 1;
		 		}
		 	}
		 return contador;
	}
	
	public int cantidadDeBasicosQueOpinaron(){
		int contador = 0;
		 	for(Opinion respueta : this.getOpiniones()){
		 		if(respueta.tipoDeConocimientoAlaHoraDeOpinar() == "Basico") {
		 			contador += 1;
		 		}
		 	}
		 return contador;
	}
	
	public boolean opinaronExpertos() {
		return  this.getOpiniones().stream().anyMatch
				(opinion -> opinion.tipoDeConocimientoAlaHoraDeOpinar() == "Experto");
	}
	
	public boolean opinaronTodosBasicos() {
		return  this.getOpiniones().stream().allMatch
				(opinion -> opinion.tipoDeConocimientoAlaHoraDeOpinar() == "Basico");
	}
	
	public void cambiarEstadoVerificacion() {
		this.getVerificado().verificar(this);
	}
	
	public boolean isMuestraVerificada() {
		return this.getVerificado().muestraYaVerificada();
	}
	
}
