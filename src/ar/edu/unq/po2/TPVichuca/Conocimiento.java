package ar.edu.unq.po2.TPVichuca;

public class Conocimiento implements IConocimiento {
	
	private String tipoDeConocimiento;
	protected Verificacion tipoDeVerificacion;
	
	public Conocimiento(String tipoDeConocimiento) {
		super();
		this.tipoDeConocimiento = tipoDeConocimiento;
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
			for(Opinion opinionActual : muestra.getOpiniones()) {
				if(opinionActual.getUser() == user) {
					noVerificado = false;
				}
			}
		return noVerificado;
	}

	@Override
	public void valorarMuestra(Usuario user,Muestra muestra,Opinion opinion){}
	

}
