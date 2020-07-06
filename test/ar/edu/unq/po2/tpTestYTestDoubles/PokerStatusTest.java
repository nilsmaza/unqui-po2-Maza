package ar.edu.unq.po2.tpTestYTestDoubles;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	private PokerStatus poker;
	private Carta carta4P;
	private Carta carta4D;
	private Carta carta10D;
	private Carta carta4C;
	private Carta carta4T;
	private Carta carta8T;
	private Carta carta2D;
	private Carta carta3D;
	private Carta carta6D;
	
	@BeforeEach
	public void setUp() {
		
		poker = new PokerStatus();
		carta4P = new Carta(4, "P");
		carta4D = new Carta(4, "D");
		carta10D = new Carta(10, "D");
		carta4C = new Carta(4, "C");
		carta4T = new Carta(4, "T");
		carta8T = new Carta(8, "T");
		carta2D = new Carta(2, "D");
		carta3D = new Carta(3, "D");
		carta6D = new Carta(6, "D");

	}
	
	@Test
	void testVerificarPorPoker() {

		assertTrue("Poker"== poker.verificar(carta4P, carta4D, carta10D, carta4C, carta4T));
		assertTrue("Nada" == poker.verificar(carta4P, carta4D, carta10D, carta6D, carta8T));
	}
	
	@Test
	void testVerificarPorLetraOColor() {
		
		ArrayList<Carta> conjunto = poker.conjuntoDeCartas(carta4D, carta10D,carta2D, carta3D, carta6D);
		assertTrue(poker.verificarPorLetra(conjunto));
		
		assertTrue("Color"== poker.verificar(carta4D, carta10D,carta2D, carta3D, carta6D));
		
		ArrayList<Carta> conjunto2 = poker.conjuntoDeCartas(carta4P, carta4D, carta10D, carta4C, carta8T);
		assertFalse(poker.verificarPorLetra(conjunto2));
		
		assertFalse("Color"== poker.verificar(carta4P, carta4D, carta10D, carta4C, carta8T));
		
	}
	
	@Test
	void testVerificarPorTrio() {
		
		ArrayList<Carta> conjunto = poker.conjuntoDeCartas(carta4P, carta4D,carta10D ,carta8T ,carta4C );
		assertTrue(poker.verificarPorTrio(conjunto));
		
		assertTrue("Trio"== poker.verificar(carta4P, carta4D,carta10D ,carta8T ,carta4C));
		
		ArrayList<Carta> conjunto2 = poker.conjuntoDeCartas(carta4P, carta4D, carta10D, carta6D, carta8T);
		assertFalse(poker.verificarPorTrio(conjunto2));
		
		assertFalse("Trio"== poker.verificar(carta4P, carta4D, carta10D, carta6D, carta8T));
	}

}
