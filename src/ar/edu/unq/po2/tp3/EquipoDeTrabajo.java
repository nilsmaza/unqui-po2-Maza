package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombre;
	private ArrayList<Persona> listaDePersonas;
	
	public EquipoDeTrabajo(String nombre) {
		super();
		this.nombre = nombre;
		this.listaDePersonas = new ArrayList<Persona>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Persona> getListaDepersona() {
		return listaDePersonas;
	}
	
	public void agregarPersona(Persona unaPersona) {
		listaDePersonas.add(unaPersona);
	}
	
	public void removerPersona(Persona unaPersona) {
		listaDePersonas.remove(unaPersona);
	}
	
	public int promedioDeEdad() {
		int sumaDeEdades=0;
			for(Persona unaPersona : listaDePersonas) {
				sumaDeEdades += unaPersona.calcularEdad();
			}
		return sumaDeEdades / this.getListaDepersona().size();
	}
	

}
