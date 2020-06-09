package ar.edu.unq.po2.TPVichuca;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OpinionTest {

	private Usuario user;
	private Usuario user2;
	private Opinion opinion1;
	private Opinion opinion2;
	private RespuestaNoDefinida noRespuesta;
	private RespuestaImagenPocoClara ImagenPocoClara;
	
	@BeforeEach
	public void setUp() {
		
		
		user = mock(Usuario.class);
		user2 = mock(Usuario.class);
		noRespuesta = new RespuestaNoDefinida();
		ImagenPocoClara = new RespuestaImagenPocoClara();
		opinion1 = new Opinion(user, noRespuesta);
		opinion2 = new Opinion(user2, ImagenPocoClara);
		
	
	}
	
	@Test
	public void opinionRespuesta(){
		
		assertEquals("No definido",opinion1.nombreDelInsecto());
		assertEquals("ImagenPocaClara",opinion2.nombreDelInsecto());
		
	}
	
	
}
