package ar.edu.unq.po2.TPVichuca;

public class Conocimiento implements IConocimiento {
	
	private String tipoDeConocimiento;
	
	public Conocimiento(String tipoDeConocimiento) {
		super();
		this.tipoDeConocimiento = tipoDeConocimiento;
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
	public void valorarMuestra(Muestra muestra) {
		// TODO Auto-generated method stub
		
	}

}
