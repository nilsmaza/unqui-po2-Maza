package ar.edu.unq.po2.tpTMyA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaYEmpleado {//tp7
		
	private Empresa empresa;
	private EmpleadoDePlanta trabajadorDePlanta;
	private EmpleadoPasante trabajadorPasante;
	private EmpleadoTemporario trabajadorTemporario;
		
	@BeforeEach
	void setUp() {	
		
		empresa = new Empresa("M");
		trabajadorDePlanta = new EmpleadoDePlanta("juan", 9,3000, false, 2);
		trabajadorPasante = new EmpleadoPasante("maria",22, 0, true, 0);
		trabajadorTemporario = new EmpleadoTemporario("carlos", 7, 1000, true, 1);

	}
		
	@Test
	void testSueldoEmpleadoDePlanta() {
			
		empresa.agregarEmpleado(trabajadorDePlanta);
		assertEquals(2871,empresa.totalAPagarEmpleados()); // 2871
			
	}
	
	@Test
	void testSueldoEmpleadoPasante() {
			
		empresa.agregarEmpleado(trabajadorPasante);
		assertEquals(765,6,empresa.totalAPagarEmpleados()); // 765,6
			
	}
	
	@Test
	void testSueldoEmpleadoTemporario() {
			
		empresa.agregarEmpleado(trabajadorTemporario);
		assertEquals(987,45,empresa.totalAPagarEmpleados()); // 987,45
			
	}
	
}
