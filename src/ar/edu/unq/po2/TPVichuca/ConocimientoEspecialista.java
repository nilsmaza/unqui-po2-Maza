package ar.edu.unq.po2.TPVichuca;

public class ConocimientoEspecialista extends Conocimiento {
	
	private static final String tipoDeConocimiento = "Especialista";
	private static final Verificacion tipoDeVerificacion = new VerificacionExperto(false);

	public ConocimientoEspecialista() {
		super(tipoDeConocimiento,tipoDeVerificacion);
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
