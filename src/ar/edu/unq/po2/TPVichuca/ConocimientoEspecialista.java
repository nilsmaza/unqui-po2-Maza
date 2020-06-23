package ar.edu.unq.po2.TPVichuca;

public class ConocimientoEspecialista extends ConocimientoExperto {
	
	public ConocimientoEspecialista() {
		super();
	}
	
	public void valorarMuestra(Usuario user,Muestra muestra,Opinion opinion) {
		if(this.muestraActaParaValorar(user, muestra)) {
			muestra.getOpiniones().add(opinion);
			muestra.cambiarEstadoVerificacion();
		}
	}
		

}
