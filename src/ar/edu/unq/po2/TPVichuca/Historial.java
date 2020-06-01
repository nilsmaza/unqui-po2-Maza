package ar.edu.unq.po2.TPVichuca;

import java.util.ArrayList;

public class Historial {
	
	private ArrayList<Muestra> listaDeMuestras;
	private EvaluadorDeConocimiento evaluador = new  EvaluadorDeConocimiento();

	public Historial(ArrayList<Muestra> listaDeMuestras) {
		super();
		this.listaDeMuestras = new ArrayList<Muestra>();
	}
	
	public EvaluadorDeConocimiento getEvaluador() {
		return evaluador;
	}

	public void setEvaluador(EvaluadorDeConocimiento evalu) {
		evaluador = evalu;
	}
	public ArrayList<Muestra> getListaDeMuestras() {
		return listaDeMuestras;
	}

	public void agregarMuestra(Muestra muestra) {
		agregarConocimientoAParticipanteNuevo(muestra.getUser());
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
				if(muestraActual.getUser() == user) {
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

}
