package ar.edu.unq.po2.TPVichuca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Historial {
	
	private ArrayList<Muestra> listaDeMuestras = new ArrayList<Muestra>();
//	private EvaluadorDeConocimiento2 evaluador = new  EvaluadorDeConocimiento2();

	public Historial() {
		super();
	}
	
//	public EvaluadorDeConocimiento2 getEvaluador() {
//		return evaluador;
//	}

//	public void setEvaluador(EvaluadorDeConocimiento2 evalu) {
//		evaluador = evalu;
//	}
	
	public ArrayList<Muestra> getListaDeMuestras() {
		return listaDeMuestras;
	}

	public void agregarMuestra(Muestra muestra) {
		this.agregarConocimientoAParticipanteNuevo(muestra.getUser());
		listaDeMuestras.add(muestra);
	}
	
	public void agregarConocimientoAParticipanteNuevo(Usuario user) {
		ConocimientoBasico basico = new ConocimientoBasico();
			if(this.primeraVesQueParticipa(user)) {
				user.setConocimiento(basico);
			}
	}
	
	public boolean primeraVesQueParticipa(Usuario user) {
		boolean participo = true;
			for(Muestra muestraActual : this.listaDeMuestras) {
				if(muestraActual.getUser() == user || muestraActual.cantidadDeVecesApareceEl(user) > 0 ) {
					participo = false;
				}
			}
		return participo;
	}
	
	public ArrayList<Muestra> muestrasDe(Usuario user){
		ArrayList<Muestra> listaDeMuestrasDe = new ArrayList<Muestra>();
			for(Muestra muestraActual : this.listaDeMuestras) {
				if(user.getIdUser() == muestraActual.getUser().getIdUser()){
					listaDeMuestrasDe.add(muestraActual);
				}
			}
		return listaDeMuestrasDe;
	}
	
	public ArrayList<Opinion> opinionesDe(Usuario user){
		ArrayList<Opinion> listaDeMuestrasDe = new ArrayList<Opinion>();
			for(Muestra muestraActual : this.listaDeMuestras) {
				listaDeMuestrasDe.addAll(muestraActual.listaDeOpinionesDe(user));
			}
		return listaDeMuestrasDe;
	}
	
/*	public List<Muestra> muestrasHace30DiasDe(Usuario user){
		LocalDate fechaActual = LocalDate.now();
			return (List<Muestra>) this.muestrasDe(user).stream()
					.filter(muestra -> pasaronMenosDe30DiasEntre(fechaActual,muestra.getFechaCreada())
					.collect(Collectors.toList());
	}
*/	
	public boolean pasaronMenosDe30DiasEntre(LocalDate fechaAct,LocalDate fechaAComparar) {
		return this.diferenciaEntreDias(fechaAct, fechaAComparar) <= 30;
	}

	public long diferenciaEntreDias(LocalDate fechaAct,LocalDate fechaAComparar) {
		return ChronoUnit.DAYS.between(fechaAct, fechaAComparar);
	}
	
	public ArrayList<Opinion> opinionesHace30DiasDe(Usuario user){
		LocalDate fechaActual = LocalDate.now();
		ArrayList<Opinion> listNewOpiniones = new ArrayList<Opinion>();
			for(Opinion unaOpinion : this.opinionesDe(user)) {
				if(this.pasaronMenosDe30DiasEntre(fechaActual, unaOpinion.getFechaEnviada())) {
					listNewOpiniones.add(unaOpinion);
				}
			}
		return listNewOpiniones;
	}
	
}
