package ar.edu.unq.po2.tpObserver2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class EncuentroDeportivoTest {
	
	private Deporte futbol;
	private Deporte voley;
	
	private Servidor deFutbolYtenis;
	private Servidor deFutbol;
	
	private AppMovil aplicacion;
	
	private InteresPorDeporte porDeporte;
	private InteresPorContricantes porContricante;
	
	private Partido ArgVsBrasil;
	private Partido partido2;
	
	@BeforeEach
	void setUp() {
		
		aplicacion = new AppMovil();
		porDeporte = new InteresPorDeporte(aplicacion);
		porContricante = new InteresPorContricantes(aplicacion);
		futbol = new Deporte("Futbol");
		voley = new Deporte("Voley");
		deFutbolYtenis = new Servidor();
		deFutbol = new Servidor();
		ArgVsBrasil = mock(Partido.class);
		partido2 = mock(Partido.class);
		
	}

	@Test
	void testAgragadoDelServidor() {
		
		futbol.agregarServidor(deFutbol);
		assertEquals(1,futbol.getServidores().size());
		
		assertTrue(voley.getServidores().isEmpty());
		
	}
	
	@Test
	void testInteresasoPorDeporte() {
		
		when(ArgVsBrasil.getDeporte()).thenReturn("Futbol");
		when(partido2.getDeporte()).thenReturn("Voley");
		when(partido2.contrincanteEnLaLista("BBB")).thenReturn(true);
		when(partido2.contrincanteEnLaLista("111")).thenReturn(true);
		
		porDeporte.agregarDeporte("Futbol");
	
		futbol.agregarServidor(deFutbolYtenis);
		futbol.agregarServidor(deFutbol);
		assertEquals(0,futbol.getPartidos().size());
		futbol.agregarPartido(ArgVsBrasil);
		assertEquals(1,futbol.getPartidos().size());
		
		assertTrue(aplicacion.interesadoEn(ArgVsBrasil));

		assertFalse(aplicacion.interesadoEn(partido2));
		
	}
	@Test 
	void testInteresPorContrincante() {
		
		porContricante.agregarContrincante("AA");
		porContricante.agregarContrincante("BB");

		porDeporte.agregarDeporte("TC");
		porDeporte.agregarDeporte("Basquet");

		when(ArgVsBrasil.getDeporte()).thenReturn("Futbol");
		when(ArgVsBrasil.contrincanteEnLaLista("AA")).thenReturn(true);
		when(ArgVsBrasil.contrincanteEnLaLista("BB")).thenReturn(false);
		
		assertTrue(aplicacion.interesadoEn(ArgVsBrasil));
	}
	

}
