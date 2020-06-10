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
		return muestra.getUser().getIdUser() != user.getIdUser();
	}	

	@Override
	public void valorarMuestra(Usuario user,Muestra muestra,Opinion opinion){}
	
}
