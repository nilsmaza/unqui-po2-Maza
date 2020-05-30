package ar.edu.unq.po2.TPVichuca;

public class Conocimiento implements IConocimiento {
	
	private String tipoDeConocimiento;
	private Verificacion tipoDeVerificacion;
	
	public Conocimiento(String tipoDeConocimiento,Verificacion tipoDeVerificacion ) {
		super();
		this.tipoDeConocimiento = tipoDeConocimiento;
		this.tipoDeVerificacion = tipoDeVerificacion;
	}

	public Verificacion getTipoDeVerificacion() {
		return tipoDeVerificacion;
	}
	
	public void setTipoDeVerificacion(Verificacion tipoDeVerificacion) {
		this.tipoDeVerificacion = tipoDeVerificacion;
	}

	public String getTipoDeConocimiento() {
		return tipoDeConocimiento;
	}

	public void setTipoDeConocimiento(String tipoDeConocimiento) {
		this.tipoDeConocimiento = tipoDeConocimiento;
	}

	public boolean muestraActaParaValorar(Usuario user,Muestra muestra) {
		return muestra.getUser() != user ;
	}	
	
	
	public boolean muestraNoValoradaPor(Usuario user, Muestra muestra) {
		boolean noVerificado = true;
			for(Opinion muestraActual : muestra.getOpiniones()) {
				if(muestraActual.getUser() == user) {
					noVerificado = false;
				}
			}
		return noVerificado;
	}

	@Override
	public void valorarMuestra(Usuario user,Muestra muestra,Opinion opinion){}
	

}
