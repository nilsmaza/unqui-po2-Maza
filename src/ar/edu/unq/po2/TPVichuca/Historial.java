package ar.edu.unq.po2.TPVichuca;

import java.util.ArrayList;

public class Historial {
	
	private ArrayList<Muestra> listaDeMuestras;

	public Historial(ArrayList<Muestra> listaDeMuestras) {
		super();
		this.listaDeMuestras = new ArrayList<Muestra>();
	}
	
	public void agregarMuestra(Muestra muestra) {
		agregarConocimientoAParticipante(muestra.getUser());
		listaDeMuestras.add(muestra);
	}
	
	public boolean primeraVesQueParticipa(Usuario user) {
		boolean participo = true;
			for(Muestra muestraActual : this.listaDeMuestras) {
				if(muestraActual.getUser() = user || muestra.cantidadDeVecesEL(user) > 0 ) {
					participo = false;
				}
			}
		return participo;
	}
	
	public void agregarConocimientoAParticipante(Usuario user) {
		if(this.primeraVesQueParticipa(user)) {
			user.setConocimiento(ConocimientoBasico);
		}
	}

}
