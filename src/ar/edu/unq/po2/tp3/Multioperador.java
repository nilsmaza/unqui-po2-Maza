package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> listaDeNumerosEnteros = new ArrayList<Integer>();

	public Multioperador() {
		super();
	}

	public ArrayList<Integer> getListaDeNumerosEnteros() {
		return listaDeNumerosEnteros;
	}
	
	public int sumarLaLista() {
		int sumaTotal=0;
		for(int unEntero : listaDeNumerosEnteros) {
			sumaTotal += unEntero;
		}
		return sumaTotal;
	}
	
	public int restarLaLista() {
		int restaTotal = 0;
		for(int unEntero : listaDeNumerosEnteros) {
			restaTotal -= unEntero;
		}
		return restaTotal;
	}
	
	public int multiplicarLaLista() {
		int multiplicacionTotal = 1;
		for(int unEntero : listaDeNumerosEnteros) {
			multiplicacionTotal *= unEntero;
		}
		return multiplicacionTotal;
	}

}
