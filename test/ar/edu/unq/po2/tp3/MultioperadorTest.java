package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {

	private Multioperador multi;
	
	@BeforeEach
	public void setUp()  {
		
		multi = new Multioperador();
		multi.getListaDeNumerosEnteros().add(1);
		multi.getListaDeNumerosEnteros().add(20);
		multi.getListaDeNumerosEnteros().add(44);
		multi.getListaDeNumerosEnteros().add(12);
		
	}
	
	@Test
	void testSuma() {
		
		assertEquals(77,multi.sumarLaLista());
		
	}
	
	@Test
	void testResta() {
		
		assertEquals(-77,multi.restarLaLista());
		
	}
	
	@Test
	void testMultiplica() {
		
		assertEquals(10560,multi.multiplicarLaLista());
		
	}
	
	
}
