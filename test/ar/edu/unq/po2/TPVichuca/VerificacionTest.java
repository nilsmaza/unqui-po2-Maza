package ar.edu.unq.po2.TPVichuca;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VerificacionTest {
	
	private Usuario user1;
	private Usuario user2;
	private Usuario user3;
	private Opinion opinion1;
	private Opinion opinion2;
	private Opinion opinion3;
	private Muestra muestra1;
	private Muestra muestra2;
	private Muestra muestra3;

	
	@BeforeEach
	public void setUp() {
		
		user1 = mock(Usuario.class);
		user2 = mock(Usuario.class);
		user3 = mock(Usuario.class);
		opinion1 = mock(Opinion.class);
		opinion2 = mock(Opinion.class);
		opinion3 = mock(Opinion.class);
		muestra1 = new Muestra(null, null, null, null);
		muestra2 = new Muestra(null, null, null, null);
		muestra3 = new Muestra(null, null, null, null);
		
	}
	
	@Test
	void testVerificacion() {
		
		assertFalse(muestra1.isMuestraVerificada());
		assertFalse(muestra2.isMuestraVerificada());
		assertFalse(muestra3.isMuestraVerificada());
		
	}
	
	@Test
	void testOpinionesDeUsuariosBasicos() {
			
		when(opinion1.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		when(opinion2.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Experto");
		when(opinion3.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		
		muestra1 = new Muestra(null, null, null, opinion1);
		muestra1.cambiarEstadoVerificacion();
		muestra1.getOpiniones().add(opinion2);
		muestra1.cambiarEstadoVerificacion();
		muestra1.getOpiniones().add(opinion3);
		muestra1.cambiarEstadoVerificacion();
		
		assertEquals(2,muestra1.cantidadDeBasicosQueOpinaron());
		
	}
	
	@Test
	void testOpinionesDeUsuariosExpertos() {
		
		when(opinion1.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		when(opinion2.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Experto");
		when(opinion3.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		
		muestra1 = new Muestra(null, null, null, opinion1);
		muestra1.getOpiniones().add(opinion2);
		muestra1.getOpiniones().add(opinion3);
		
		assertEquals(1,muestra1.cantidadDeExpertosQueOpinaron());
		
	}
	
	@Test
	void testOpinionActualEnBasico() {
		
		when(user1.tipoDeConocimiento()).thenReturn("Basico");
		when(user2.tipoDeConocimiento()).thenReturn("Experto");
		when(user3.tipoDeConocimiento()).thenReturn("Basico");
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		when(opinion1.nombreDelInsecto()).thenReturn("Vichuca");
		when(opinion2.nombreDelInsecto()).thenReturn("NoVichuca");
		when(opinion3.nombreDelInsecto()).thenReturn("Vichuca");
		
		muestra1 = new Muestra(user1, null, null, opinion1);
		muestra1.getOpiniones().add(opinion2);
		muestra1.getOpiniones().add(opinion3);
		
		assertEquals(3,muestra1.getOpiniones().size());
		assertEquals("Vichuca",muestra1.opinionActual().nombreDelInsecto());
		
	}
	
	@Test
	void testOpinionActualEnExperto() {
		
		when(user1.tipoDeConocimiento()).thenReturn("Basico");
		when(user2.tipoDeConocimiento()).thenReturn("Experto");
		when(user3.tipoDeConocimiento()).thenReturn("Basico");
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		when(opinion1.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		when(opinion2.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		when(opinion3.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		when(opinion1.nombreDelInsecto()).thenReturn("Vichuca");
		when(opinion2.nombreDelInsecto()).thenReturn("NoVichuca");
		when(opinion3.nombreDelInsecto()).thenReturn("NoVichuca");

		muestra1 = new Muestra(null, null, null, opinion1);
		muestra1.getOpiniones().add(opinion2);
		muestra1.getOpiniones().add(opinion3);
		
		assertEquals("NoVichuca",muestra1.opinionActual().nombreDelInsecto());
		
	}
	
	@Test
	void testOpinionActualTodosBasicos() {
		
	
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		when(opinion1.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		when(opinion2.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		when(opinion3.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		when(opinion1.nombreDelInsecto()).thenReturn("Vichuca");
		when(opinion2.nombreDelInsecto()).thenReturn("NoVichuca");
		when(opinion3.nombreDelInsecto()).thenReturn("NoVichuca");

		muestra1 = new Muestra(user1, null, null, opinion1);
		muestra1.getOpiniones().add(opinion2);
		muestra1.getOpiniones().add(opinion3);
		muestra1.cambiarEstadoVerificacion();
		
		assertEquals(3,muestra1.cantidadDeBasicosQueOpinaron());
		assertEquals(2,muestra1.cantidadDeVecesQueApareceLa(opinion2));
		assertEquals(1,muestra1.cantidadDeVecesQueApareceLa(opinion1));
		assertTrue(muestra1.opinaronTodosBasicos());
		assertEquals("NoVichuca",muestra1.opinionActual().nombreDelInsecto());
		
	}
	
	@Test
	void testOpinionActualEnBasicoSinDecicion() {
		
		when(user1.tipoDeConocimiento()).thenReturn("Basico");
		when(user2.tipoDeConocimiento()).thenReturn("Experto");
		when(user3.tipoDeConocimiento()).thenReturn("Basico");
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		when(opinion1.nombreDelInsecto()).thenReturn("Vichuca");
		when(opinion2.nombreDelInsecto()).thenReturn("NoVichuca");
		when(opinion3.nombreDelInsecto()).thenReturn("QueEsUnaVichuca");

		muestra1 = new Muestra(null, null, null, opinion1);
		muestra1.getOpiniones().add(opinion2);
		muestra1.getOpiniones().add(opinion3);
		muestra1.cambiarEstadoVerificacion();
		
		assertEquals("No definido",muestra1.opinionActual().nombreDelInsecto());
		
	}
	
	@Test
	void testOpinionActualEnExpertoSinDecicion() {
		
		when(user1.tipoDeConocimiento()).thenReturn("Basico");
		when(user2.tipoDeConocimiento()).thenReturn("Experto");
		when(user3.tipoDeConocimiento()).thenReturn("Basico");
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		when(opinion1.nombreDelInsecto()).thenReturn("Vichuca");
		when(opinion2.nombreDelInsecto()).thenReturn("NoVichuca");
		when(opinion3.nombreDelInsecto()).thenReturn("QueEsUnaVichuca");

		muestra1 = new Muestra(null, null, null, opinion1);
		muestra1.getOpiniones().add(opinion2);
		muestra1.getOpiniones().add(opinion3);
		muestra1.cambiarEstadoVerificacion();
		
		assertEquals("No definido",muestra1.opinionActual().nombreDelInsecto());
		
	}
	
	@Test
	void testPuedeOpinarSobreLaMuestraBasico() {
		
		when(user1.getIdUser()).thenReturn(111);
		when(user2.getIdUser()).thenReturn(222);
		when(user3.getIdUser()).thenReturn(333);
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		when(opinion1.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		when(opinion3.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		
		muestra1 = new Muestra(user1, null, null, opinion1);
		muestra1.getOpiniones().add(opinion3);
		muestra1.cambiarEstadoVerificacion();
		
		assertTrue(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user2, muestra1));
		
		assertFalse(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user1, muestra1));
		assertFalse(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user3, muestra1));
	
	}
	
	@Test
	void testPuedeOpinarSobreLaMuestraExperto() {
		
		when(user1.getIdUser()).thenReturn(111);
		when(user2.getIdUser()).thenReturn(222);
		when(user3.getIdUser()).thenReturn(333);
		when(user1.tipoDeConocimiento()).thenReturn("Experto");
		when(user2.tipoDeConocimiento()).thenReturn("Experto");
		when(user3.tipoDeConocimiento()).thenReturn("Experto");
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		
		muestra1 = new Muestra(user1, null, null, opinion1);
		muestra1.getOpiniones().add(opinion3);
		muestra1.cambiarEstadoVerificacion();
		
		assertTrue(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user2, muestra1));
		
		assertFalse(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user1, muestra1));
		assertFalse(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user3, muestra1));

		
	}
	
	@Test
	void testPuedeOpinarSobreLaMuestraBasicoCon2ExpertosYaOpinaron() {
		
		when(user1.tipoDeConocimiento()).thenReturn("Experto");
		when(user2.tipoDeConocimiento()).thenReturn("Basico");
		when(user3.tipoDeConocimiento()).thenReturn("Experto");
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		
		muestra1 = new Muestra(user1, null, null, opinion1);
		muestra1.getOpiniones().add(opinion3);
		muestra1.cambiarEstadoVerificacion();
		
		
		assertFalse(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user2, muestra1));
		
		assertFalse(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user1, muestra1));
		assertFalse(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user3, muestra1));
		
	}
	
	@Test
	void testPuedeOpinarSobreLaMuestraExperoCon2ExpertosYaOpinaron() {
		
		when(user1.tipoDeConocimiento()).thenReturn("Experto");
		when(user2.tipoDeConocimiento()).thenReturn("Basico");
		when(user3.tipoDeConocimiento()).thenReturn("Experto");
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		
		muestra1 = new Muestra(user1, null, null, opinion1);
		muestra1.getOpiniones().add(opinion3);
		muestra1.cambiarEstadoVerificacion();
		
		assertFalse(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user2, muestra1));
		
		assertFalse(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user1, muestra1));
		assertFalse(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user3, muestra1));

		
	}
	
	@Test
	void verificarMuestra() {
		
		when(user1.tipoDeConocimiento()).thenReturn("Experto");
		when(user2.tipoDeConocimiento()).thenReturn("Basico");
		when(user3.tipoDeConocimiento()).thenReturn("Experto");
		
		when(opinion1.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Experto");
		when(opinion2.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Basico");
		when(opinion3.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Experto");
		
		when(opinion1.nombreDelInsecto()).thenReturn("Vichuca");
		when(opinion2.nombreDelInsecto()).thenReturn("NoVichuca");
		when(opinion3.nombreDelInsecto()).thenReturn("Vichuca");
		
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		
		muestra1 = new Muestra(user1, null, null, opinion1);
		assertEquals("No definido",muestra1.opinionActual().nombreDelInsecto());
		muestra1.cambiarEstadoVerificacion();
		muestra1.getOpiniones().add(opinion2);
		muestra1.cambiarEstadoVerificacion();
		muestra1.getOpiniones().add(opinion3);
		
		assertEquals(2,muestra1.cantidadDeExpertosQueOpinaron());
		assertFalse(muestra1.isMuestraVerificada());
		
		assertEquals("Vichuca",muestra1.opinionActual().nombreDelInsecto());
		assertEquals(2,muestra1.cantidadDeExpertosQueOpinaron());
		
		muestra1.cambiarEstadoVerificacion();
		assertTrue(muestra1.isMuestraVerificada());
		
		assertEquals("Vichuca",muestra1.opinionActual().nombreDelInsecto());
		assertFalse(muestra1.getVerificado().getVerificado().puedeOpinarSobreLa(user2, muestra1));
		
		
	}
	
/*	@Test
	void cambioDeVerificacion() {
		
		when(user1.getIdUser()).thenReturn(111);
		when(user2.getIdUser()).thenReturn(222);
		when(user3.getIdUser()).thenReturn(333);
		when(opinion1.getUser()).thenReturn(user1);
		when(opinion2.getUser()).thenReturn(user2);
		when(opinion3.getUser()).thenReturn(user3);
		when(opinion1.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Experto");
		when(opinion3.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Experto");
		
		muestra1 = new Muestra(user1, null, null, opinion1);
		muestra1.getOpiniones().add(opinion3);
	//	assertEquals("Basico" , muestra1.getVerificado().getVerTipo() );
		muestra1.cambiarEstadoVerificacion();
	//	assertEquals("Experto" , muestra1.getVerificado().getVerTipo() );
	}
*/
}
