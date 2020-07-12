package ar.edu.unq.po2.StateYStrategy2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideoJuegoTest {
	
	private VideoJuego metalSlug;
	
	
	@BeforeEach
	void setUp(){
		
		metalSlug = new VideoJuego();
		
	}

	@Test
	void testPantallaDeInicio() {
		
		assertEquals("Presentacion",metalSlug.iniciarJuego());
		
	}
	
	@Test
	void testPantallaUnJugador() {
		
		metalSlug.agregarFicha();
		assertEquals(1,metalSlug.getFichas());
		
		assertEquals("Solo",metalSlug.iniciarJuego());
		
		assertEquals(0,metalSlug.getFichas());
		
	}
	
	@Test
	void testPantallaDosJugadores() {
		
		metalSlug.agregarFicha();
		metalSlug.agregarFicha();
		metalSlug.agregarFicha();
		assertEquals(3,metalSlug.getFichas());
		
		assertEquals("Cooperativo",metalSlug.iniciarJuego());
		
		assertEquals(1,metalSlug.getFichas());
		
	}

}
