package ar.edu.unq.po2.TPVichuca;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class HistorialTest {

	private Muestra muestra1;
	private Muestra muestra2;
	private Muestra muestra3;
	private Historial historial1;
	private Usuario user;
	private Usuario user2;
	private Usuario user3;
	
	@BeforeEach
	public void setUp() {
		
		muestra1 = new Muestra(user, null, null, null);
		muestra2 = new Muestra(user2, null, null, null);
	//	user2 = mock(Usuario.class);
		user3 = mock(Usuario.class);
		historial1 = new Historial();	
	}
	
	@Test
	public void historial() {
		
		historial1 = new Historial();
		user = new Usuario(112, null);
	
		muestra1 = new Muestra(user, null, null, null);

		historial1.agregarMuestra(muestra1);
	
		assertEquals(1,historial1.getListaDeMuestras().size());
		
	}
	
	@Test
	public void historialPrimeraVezQueParticipa() {
		
		historial1 = new Historial();
		muestra1 = new Muestra(user, null, null, null);
		
		assertTrue(historial1.primeraVesQueParticipa(user));
		assertTrue(historial1.primeraVesQueParticipa(user2));
		assertTrue(historial1.primeraVesQueParticipa(user3));
		
		historial1.getListaDeMuestras().add(muestra1);
		assertFalse(historial1.primeraVesQueParticipa(user));
		
	}
	
	@Test
	public void muestraDeUser() {
		
		historial1 = new Historial();
		
		user = new Usuario(112, null);
		user2 = new Usuario(114, null);
		
		muestra1 = new Muestra(user, null, null, null);
		muestra2 = new Muestra(user2, null, null, null);
		muestra3 = new Muestra(user, null, null, null);
		
		
		historial1.getListaDeMuestras().add(muestra1);
		historial1.getListaDeMuestras().add(muestra2);
		historial1.getListaDeMuestras().add(muestra3);
		
		assertEquals(3,historial1.getListaDeMuestras().size());

		assertEquals(2,historial1.muestrasDe(user).size());
		
	}
	
	
}
