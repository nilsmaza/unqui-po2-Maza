package ar.edu.unq.po2.TPVichuca;

public class ConocimientoExperto extends Conocimiento{

	private static final String tipoDeConocimiento = "Experto";
	
	public ConocimientoExperto() {
		super(tipoDeConocimiento);
	}
	
	public void valorarMuestra(Usuario user,Muestra muestra,Opinion opinion) {
		if(muestra.getVerificado().getVerificado().puedeOpinarSobreLa(user,muestra) 
				&& this.muestraActaParaValorar(user, muestra)) {
					muestra.getOpiniones().add(opinion);
					muestra.cambiarEstadoVerificacion();
		}
	}

}
