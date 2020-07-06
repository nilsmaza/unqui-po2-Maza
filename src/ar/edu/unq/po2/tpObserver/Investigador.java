package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;

public class Investigador implements IObserver{
	
	private String nombre;
	private SistemaDeArticulos sistema;
	private ArrayList<String> temasDeInteres = new ArrayList<String>();
	
	public Investigador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public SistemaDeArticulos getSistema() {
		return sistema;
	}

	public ArrayList<String> getTemasDeInteres() {
		return temasDeInteres;
	}

	public void setSistema(SistemaDeArticulos sistema) {
		this.sistema = sistema;
	}

	public void meInteresan(String porPalabrasDeIdentificacion) {
		temasDeInteres.add(porPalabrasDeIdentificacion);
	}
	
	public boolean hayTemasDeInteresParaInvestigador(ArrayList<String> listaDeDatos) {
		int temasDeInteres = 0;
		for(String palabra : listaDeDatos) {
			if(this.getTemasDeInteres().contains(palabra)) {
				temasDeInteres += 1;
			}
		}
		return temasDeInteres>=1;
	}
	
	public void suscribirse() {
		this.sistema.agregarObserver(this);
	}
	
	public void desuscribirse() {
		this.sistema.removerObserver(this);
	}
	
	@Override
	public void update(Articulo nuevoArticulo) {
		if(this.hayTemasDeInteresParaInvestigador(nuevoArticulo.getListadoDeDatos())) {
			System.out.println("nuevo articulo que te puede interesar");
		}
	}

	public String getNombre() {
		return nombre;
	}

	

}
