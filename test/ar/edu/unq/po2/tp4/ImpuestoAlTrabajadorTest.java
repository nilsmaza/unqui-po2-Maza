package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoAlTrabajadorTest {

	private Ingreso ingreso;
	private IngresoPorHorasExtras horasExtras;
	private Trabajador trabajador1;
	private Trabajador trabajador2;
	private Trabajador trabajador3;
	
	@BeforeEach
	public void setUp() {
		
		ingreso = new Ingreso("Abril", "", 10000);
		horasExtras = new IngresoPorHorasExtras("Febrero","", 10000, 3);
		trabajador1 = new Trabajador();
		trabajador2 = new Trabajador();
		trabajador3 = new Trabajador();
		
		trabajador1.agregarIngreso(ingreso);
		trabajador2.agregarIngreso(horasExtras);
		
		trabajador3.agregarIngreso(ingreso);
		trabajador3.agregarIngreso(ingreso);
		trabajador3.agregarIngreso(horasExtras);
			
	}
	
	@Test
	public void TestTrabajadorImpuestoAPagar() {
		
		assertEquals(200 ,trabajador1.getImpuestoAPagar());
		assertEquals(0 ,trabajador2.getImpuestoAPagar());
		assertEquals(400 ,trabajador3.getImpuestoAPagar());
		
	}
	
	@Test
	public void TestTrabajadorMontoImponible() {
		
		trabajador2.agregarIngreso(horasExtras);
		
		assertEquals(10000 ,trabajador1.getMontoImponible());
		assertEquals(0 ,trabajador2.getMontoImponible());
		assertEquals(20000 ,trabajador3.getMontoImponible());
		
	}
	
	@Test
	public void TestTrabajadorImpuestoAP() {
		
		assertEquals(10000 ,trabajador1.getTotalPercibido());
		assertEquals(10000 ,trabajador2.getTotalPercibido());
		assertEquals(30000 ,trabajador3.getTotalPercibido());
	}

}
