package ar.edu.unq.po2.StateYStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEncriptadorNaive {
	
	private EncriptadorPorVocales reemprazoDeVocales;
	private DesencriptadorPorVocales vocalesDeReemplazo;
	private DesencriptadorPorNumero numeroPorLetras;
	private EncriptadoNumerico letrasPorNumeros;
	private EncriptadorNaive EncriptadorVocales;
	private EncriptadorNaive EncriptadorNumerosOLetras;

	
	@BeforeEach
	void setUp() {
		
		reemprazoDeVocales = new EncriptadorPorVocales();
		vocalesDeReemplazo = new DesencriptadorPorVocales();
		
		numeroPorLetras = new DesencriptadorPorNumero();
		letrasPorNumeros = new EncriptadoNumerico();
		
		EncriptadorVocales = new EncriptadorNaive(reemprazoDeVocales, vocalesDeReemplazo);
		EncriptadorNumerosOLetras = new EncriptadorNaive(letrasPorNumeros, numeroPorLetras);
		
	}

	@Test
	void testEncriptacionDeVocales() {
		
		assertEquals("upirecoun",EncriptadorVocales.encriptar("operacion")); //a=e e=i i=o o=u
		assertEquals("operacion",EncriptadorVocales.desencriptar("upirecoun"));
		
	}
	
	@Test
	void testEncriptadorNumerico() {
		
		assertEquals("15,16,4,18,0,2,8,15,13",EncriptadorNumerosOLetras.encriptar("oPeracion"));
		assertEquals("operacion",EncriptadorNumerosOLetras.desencriptar("15,16,4,18,0,2,8,15,13"));
		
	}

}
