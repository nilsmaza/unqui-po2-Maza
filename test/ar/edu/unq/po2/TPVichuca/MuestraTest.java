package ar.edu.unq.po2.TPVichuca;


import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import java.awt.image.BufferedImage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MuestraTest {

	private Muestra muestra1;
	private Usuario user;
	private Usuario user2;
	private Ubicacion lugar;
	private Opinion opinionUser;
	private BufferedImage foto;
	private IClasificacion respuesta1;
	private IClasificacion respuesta2;
	private VerificacionBasica verificacion;
	private Opinion otraOpinion1;
	private Opinion otraOpinion2;

	@BeforeEach
	public void setUp() {
		
		user = mock(Usuario.class);
		user2 = mock(Usuario.class);
		lugar = mock(Ubicacion.class);
		opinionUser = mock(Opinion.class);
		foto = mock(BufferedImage.class);
		respuesta1 = mock(IClasificacion.class); 	
		verificacion = new VerificacionBasica();
		otraOpinion1 = mock(Opinion.class);
		otraOpinion2 = mock(Opinion.class);
		respuesta2 = mock(IClasificacion.class);
		muestra1 = new Muestra(user, foto, lugar , opinionUser);
	}
	
	@Test
	public void testMuestra() {
		
		muestra1.setVerificado(verificacion);
		assertFalse(muestra1.getOpiniones().isEmpty());
		
		when(respuesta1.nombreDelInsectoORespuesta()).thenReturn("Chince Foliada");
		when(respuesta2.nombreDelInsectoORespuesta()).thenReturn("no se distinge");
		when(opinionUser.getRespuesta()).thenReturn(respuesta1);
		when(opinionUser.getUser()).thenReturn(user);
		
		assertEquals("Chince Foliada",respuesta1.nombreDelInsectoORespuesta());
		assertEquals("Chince Foliada",opinionUser.getRespuesta().nombreDelInsectoORespuesta());
			
	}
		@Test
		public void testCantidadDeOpinionesExpertos() {
		
		when(opinionUser.getUser()).thenReturn(user);
			
		assertEquals(muestra1.cantidadDeVecesQueApareceLa(opinionUser),1);
		assertEquals(muestra1.cantidadDeVecesApareceEl(user),1);
	//	assertFalse(muestra1.listaDeOpinionesDe(user).isEmpty());
		
		when(otraOpinion1.getRespuesta()).thenReturn(respuesta1);
		when(otraOpinion2.getRespuesta()).thenReturn(respuesta2);
		
		when(otraOpinion1.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("");
		
		muestra1.getOpiniones().add(otraOpinion1);
		
		
		assertEquals(muestra1.cantidadDeExpertosQueOpinaron(),0); // 0/2

		when(otraOpinion1.tipoDeConocimientoAlaHoraDeOpinar()).thenReturn("Experto");
		muestra1.getOpiniones().add(otraOpinion2);
		
		assertEquals(muestra1.cantidadDeExpertosQueOpinaron(),1); // 1/3
		
	}
		
		@Test
		public void testCantidadDevecesQueApareceElUser() {
			
			when(user.getIdUser()).thenReturn(111);
			when(user2.getIdUser()).thenReturn(222);
			when(opinionUser.getUser()).thenReturn(user);
			
			muestra1 = new Muestra(user, foto, lugar , opinionUser);
			
			assertEquals(1 , muestra1.cantidadDeVecesApareceEl(user));
			assertEquals(0 , muestra1.cantidadDeVecesApareceEl(user2));
				
		}
		
		@Test
		public void testOpinionDeUser() {
			
			when(user.getIdUser()).thenReturn(111);
			when(user2.getIdUser()).thenReturn(222);
			when(otraOpinion1.getUser()).thenReturn(user2);
			when(otraOpinion1.nombreDelInsecto()).thenReturn("Vichuca");
			
			muestra1 = new Muestra(user2, foto, lugar , otraOpinion1);
			
			assertEquals(otraOpinion1,muestra1.OpinionDe(user2));
			assertEquals(null,muestra1.OpinionDe(user));
			
		}
		

}
