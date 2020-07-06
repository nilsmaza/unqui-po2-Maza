package ar.edu.unq.po2.tpTestYTestDoubles;

import java.util.ArrayList;

public class PokerStatus {

	public String verificar
	(Carta carta1,Carta carta2,Carta carta3,Carta carta4,Carta carta5) {
		ArrayList<Carta> conjunto = this.conjuntoDeCartas(carta1, carta2, carta3, carta4, carta5);
		String resultado = "Nada";
		if( this.verificarPoker(conjunto)) { resultado = "Poker";}
		if( this.verificarPorColor(conjunto)) { resultado = "Color"; }
		if( this.verificarPorTrio(conjunto)) { resultado = "Trio"; }
	return resultado;
	}
	
	public boolean verificarPorColor(ArrayList<Carta> lista) {
		return this.verificarPorLetra(lista);
	}
	
	public boolean verificarPorTrio(ArrayList<Carta> lista) {
		boolean valor = false;
		for(Carta carta : lista){
				int numero = carta.getNumero();
					if(this.verificarNumero(numero, lista) == 3){
						valor = true;
					}
		}
	return valor;
	}
		
	public boolean verificarPorLetra(ArrayList<Carta> lista) {
		boolean valor = false;
			for(Carta carta : lista){
				String palo = carta.getPalo();
					if(this.verificarLetra(palo, lista) == 5){
						valor = true;
					}
			}
		return valor;
	}
	
	public int verificarLetra(String palo,ArrayList<Carta> lista) {
		int contador = 0;
			for(Carta cartaActual : lista){
				if(cartaActual.getPalo() == palo) {
					contador +=1;
				}
			}
		return contador;
	}
	
	public boolean verificarPoker(ArrayList<Carta> lista) {
		boolean valor = false;
			for(Carta carta : lista){
					int numero = carta.getNumero();
						if(this.verificarNumero(numero, lista) == 4){
							valor = true;
						}
				
			}
		return valor;
	}
	
	public int verificarNumero(int numero,ArrayList<Carta> lista) {
		int contador = 0;
			for(Carta carta : lista){
				if(numero == carta.getNumero()) {
					contador +=1;
				}
			}
		return contador;
	}
	
	public ArrayList<Carta> conjuntoDeCartas
	(Carta carta1,Carta carta2,Carta carta3,Carta carta4,Carta carta5) {
		ArrayList<Carta> listaDeCartas = new ArrayList<Carta>();
			listaDeCartas.add(carta1);
			listaDeCartas.add(carta2);
			listaDeCartas.add(carta3);
			listaDeCartas.add(carta4);
			listaDeCartas.add(carta5);
		return listaDeCartas;
	}
	
}
