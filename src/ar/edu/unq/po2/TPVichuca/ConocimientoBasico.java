package ar.edu.unq.po2.TPVichuca;


public class ConocimientoBasico extends Conocimiento {
	
	
	private static final String tipoDeConocimiento = "Basico";
	private static final Verificacion tipoDeVerificacion = new VerificacionBasica(false);

	public ConocimientoBasico() {
		super(tipoDeConocimiento,tipoDeVerificacion);
	}

	public void valorarMuestra(Usuario user,Muestra muestra,Opinion opinion) {
		if(this.getTipoDeVerificacion().puedeOpinarSobreLa(muestra) && this.muestraActaParaValorar(user, muestra)) {
			muestra.getOpiniones().add(opinion);
		}
	}
	
}
