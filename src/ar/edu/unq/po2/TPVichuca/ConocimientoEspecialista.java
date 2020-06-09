package ar.edu.unq.po2.TPVichuca;

public class ConocimientoEspecialista extends Conocimiento {
	
	private static final String tipoDeConocimiento = "Especialista";

	public ConocimientoEspecialista() {
		super(tipoDeConocimiento);
		this.tipoDeVerificacion = new VerificacionExperto();
	}
	
	public void valorarMuestra(Usuario user,Muestra muestra,Opinion opinion) {
		if(this.esExperto() && this.muestraActaParaValorar(user, muestra)) {
			muestra.getOpiniones().add(opinion);
		}
	}
	
	public boolean esExperto() {
		return true;
	}
	
	

}
