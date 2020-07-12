package ar.edu.unq.po2.StateYStrategy3;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class ReproductorMP3Test {
	
	private ReproductorMP3 MP3;
	private Song cancionDePrueba;
	
	@BeforeEach
	void setUp(){
		
		cancionDePrueba = mock(Song.class);
		MP3 = new ReproductorMP3(cancionDePrueba);
		
	}

	@Test
	void testEstadoDelReproductor() throws Exception {
		
		
		assertEquals("Estado Inicial",MP3.getEstado().estadoDelReproductor());
		MP3.play();
		assertEquals("reproducionEnProceso",MP3.getEstado().estadoDelReproductor());
		assertNotNull(MP3.getCancionAReproducir());
		
		MP3.pause();
		assertEquals("Cancion Pausada",MP3.getEstado().estadoDelReproductor());
		assertNotNull(MP3.getCancionAReproducir());
		
		MP3.stop();
		assertEquals("Sin Cancion",MP3.getEstado().estadoDelReproductor());
		assertNull(MP3.getCancionAReproducir());
		
	}

}
