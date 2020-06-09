package ar.edu.unq.po2.TPVichuca;


public class ConocimientoBasico extends Conocimiento {
	
	
	private static final String tipoDeConocimiento = "Basico";

	public ConocimientoBasico() {
		super(tipoDeConocimiento);
		this.tipoDeVerificacion = new VerificacionBasica();
	}

	public void valorarMuestra(Usuario user,Muestra muestra,Opinion opinion) {
		if(this.getTipoDeVerificacion().puedeOpinarSobreLa(user,muestra) && this.muestraActaParaValorar(user, muestra)) {
			muestra.getOpiniones().add(opinion);
		}
	}
	
}
