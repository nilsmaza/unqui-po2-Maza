package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> listaDeNumerosEnteros = new ArrayList<Integer>();

	public ArrayList<Integer> getListaDeNumerosEnteros() {
		return listaDeNumerosEnteros;
	}

	public void setListaDeNumerosEnteros(ArrayList<Integer> listaDeNumerosEnteros) {
		this.listaDeNumerosEnteros = listaDeNumerosEnteros;
	}

	public Multioperador(ArrayList<Integer> listaDeNumerosEnteros) {
		super();
		this.listaDeNumerosEnteros = listaDeNumerosEnteros;
	}
	
	public Integer sumarLaLista() {
		Integer sumaTotal=0;
		for(int unEntero : listaDeNumerosEnteros) {
			sumaTotal += unEntero;
		}
		return sumaTotal;
	}
	
	public Integer restarLaLista() {
		Integer restaTotal = 0;
		for(int i = 0; i < listaDeNumerosEnteros.size() ; i++) {
			restaTotal -= i;
		}
		return restaTotal;
	}
	
	public Integer multiplicarLaLista() {
		Integer multiplicacionTotal = 1;
		for(int unEntero : listaDeNumerosEnteros) {
			multiplicacionTotal *= unEntero;
		}
		return multiplicacionTotal;
	}

}
