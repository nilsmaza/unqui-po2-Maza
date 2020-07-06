package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class EquipoDeTrabajoTest {

	private Persona andres;
	private Persona pablo;
	private Persona carlos;
	
	private EquipoDeTrabajo equipoA;
	
	@BeforeEach
	public void setUp()  {
		
		Calendar fechaDeNacimiento1 = new GregorianCalendar(1970,02,14);
		Calendar fechaDeNacimiento2 = new GregorianCalendar(1999,04,20);
		Calendar fechaDeNacimiento3 = new GregorianCalendar(2000,11,11);
		
		andres = new Persona("Andres", "A",fechaDeNacimiento1);
		pablo = new Persona("Pablo", "B",fechaDeNacimiento2);
		carlos = new Persona("Carlos","C",fechaDeNacimiento3);
		
		equipoA = new EquipoDeTrabajo("ABC");
		
		equipoA.getListaDepersona().add(andres);
		equipoA.getListaDepersona().add(pablo);
		equipoA.getListaDepersona().add(carlos);
	}
	
	@Test
	void testEdadDePersonas() {
		
		assertEquals(20,carlos.calcularEdad());
		assertEquals(21,pablo.calcularEdad());
		assertEquals(50,andres.calcularEdad());
		
		
	}
	
	@Test
	void testPromedioDeEdad() {
		
		assertEquals("ABC",equipoA.getNombre());
		
		assertEquals(30,equipoA.promedioDeEdad()); // 29,6666
		equipoA.removerPersona(pablo);
		
		assertEquals(35,equipoA.promedioDeEdad());
		equipoA.removerPersona(andres);
		
		assertEquals(20,equipoA.promedioDeEdad());
		
		equipoA.agregarPersona(pablo);
		assertEquals(20,equipoA.promedioDeEdad());
	
	}
	
	@Test
	void testMenorQue() {
		
		assertTrue(pablo.menorQue(andres));
		assertFalse(pablo.menorQue(carlos));
		
		assertTrue(carlos.menorQue(andres));
		assertTrue(carlos.menorQue(pablo));
		
		assertFalse(andres.menorQue(pablo));
		assertFalse(andres.menorQue(carlos));
	}

}
