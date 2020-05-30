package ar.edu.unq.po2.TPVichuca;

public class ConocimientoExperto extends Conocimiento{

	private static final String tipoDeConocimiento = "Experto";
	private static final Verificacion tipoDeVerificacion = new VerificacionExperto(false);
	
	public ConocimientoExperto() {
		super(tipoDeConocimiento,tipoDeVerificacion);
	}
	
	public void valorarMuestra(Usuario user,Muestra muestra,Opinion opinion) {
		if(this.getTipoDeVerificacion().puedeOpinarSobreLa(muestra) && this.muestraActaParaValorar(user, muestra)) {
			muestra.getOpiniones().add(opinion);
		}
	}
/*	
	public boolean esExperto(Historial historial ,Usuario user) {
		return this.condicionMuestra(historial, user) && this.condicionOpinion(historial,user);
	}
	
	public boolean condicionMuestra(Historial historial ,Usuario user) {
		return 	this.condicionDeDiasPorMuestra(historial, user)&&
				this.condicionPorCantidadDeMuestras(user,historial);
	}
	
	public boolean condicionOpinion(Historial historial ,Usuario user) {
		return 	this.condicionDeDiasPorOpinion(historial, user)&&
				this.condicionPorCantidadDeOpiniones(user,historial);
	}
	
	public boolean condicionPorCantidadDeMuestras(Usuario user,Historial historial) {
		return this.totalDeEnviosDeMuestras(user,historial) > 10 ;
	}
	
	public boolean condicionPorCantidadDeOpiniones(Usuario user,Historial historial) {
		return this.revisionesHechas(user,historial) > 20;
	}

	public boolean condicionDeDiasPorMuestra(Historial historial,Usuario user) {
		return this.diasQueColaboroEnMuestas(user, historial) > 30;
	}
	public boolean condicionDeDiasPorOpinion(Historial historial,Usuario user) {
		return this.diasQueColaboroEnOpiniones(user, historial) > 30;
	}
	
	public Integer diasQueColaboroEnMuestas(Usuario user,Historial historial) {
		int DiasMasLargo = 0;
			for(Muestra muestra : historial.muestrasDe(user) ) {
				if(DiasMasLargo < this.diferenciaEnDias2M(muestra) ) {
					DiasMasLargo = this.diferenciaEnDias2M(muestra);
				}
			}
		return DiasMasLargo;
	}
	
	public Integer diasQueColaboroEnOpiniones(Usuario user,Historial historial) {
		int DiasMasLargo = 0;
			for(Muestra muestra : historial.getListaDeMuestras() ) {
				if(DiasMasLargo < this.diasDeOpiniones(muestra, user) ) {
					DiasMasLargo = this.diasDeOpiniones(muestra, user);
				}
			}
		return DiasMasLargo;
	}
	
	public ArrayList<Opinion> listaDeOpinionesDe(Muestra muestra,Usuario user){
		 return muestra.listaDeOpinionesDe(user) ;
	}
	
	public int diasDeOpiniones(Muestra muestra,Usuario user) {
		int DiasMasLargo = 0;
			for(Opinion opinion : this.listaDeOpinionesDe(muestra, user) ) {
				if(DiasMasLargo < this.diferenciaEnDias2O(opinion) ) {
					DiasMasLargo = this.diferenciaEnDias2O(opinion);
			}
		}
		return DiasMasLargo;
	}
	
	public int diferenciaEnDias2M(Muestra muestra) {
		Calendar fechaActual = Calendar.getInstance();
			long diferenciaEn_ms = fechaActual.getTimeInMillis() - muestra.getFechaCreada().getTimeInMillis();
			long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24);
		return (int) dias;
	}
	
	public int diferenciaEnDias2O(Opinion opinion) {
		Calendar fechaActual = Calendar.getInstance();
			long diferenciaEn_ms = fechaActual.getTimeInMillis() - opinion.getFechaEnviada().getTimeInMillis();
			long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24);
		return (int) dias;
	}
	
	public Integer totalDeEnviosDeMuestras(Usuario user,Historial historial) {
		return historial.muestrasDe(user).size();
	}
	
	public Integer revisionesHechas(Usuario user,Historial historial) {
		return historial.opinionesDe(user).size();
	}
*/
}