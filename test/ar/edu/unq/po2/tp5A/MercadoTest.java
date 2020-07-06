package ar.edu.unq.po2.tp5A;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MercadoTest {
	
	private Cliente cliente1;
	private Cliente cliente2;
	private Caja cajaA;
	private Caja cajaB;
	
	private ProductoDeCoperativa arrozC;
	private ProductoDeEmpresaTradicional arrozE;
	
	private ProductoDeCoperativa fideoC;
	private ProductoDeEmpresaTradicional fideoE;
	private Servicio cable;
	private Servicio telefono;
	
 	private Impuesto impuestoA;
	private Impuesto seguridad;

	@BeforeEach
	void setUp() {
	
		cliente1 = new Cliente("Maria");
		cliente2 = new Cliente("Juan");
		cajaA = new Caja();
		cajaB = new Caja();
		
		
		arrozC = new ProductoDeCoperativa(50, 1);
		arrozE = new ProductoDeEmpresaTradicional(50, 10);
		
		
		fideoC = new ProductoDeCoperativa(30, 2);
		fideoE = new ProductoDeEmpresaTradicional(20, 10);
		
		cable = new Servicio(200, 1);
		telefono = new Servicio(100, 2);
		
		impuestoA = new Impuesto(50);
		seguridad = new Impuesto(200);
		
	}

	@Test
	void testClienteAgotaStock() {
		
		
		cliente1.agregarProducto(arrozC);
		cliente1.agregarProducto(arrozE);
		
		cajaA.montoTotalAPagarDelCliente(cliente1);
			
		
		assertEquals(0,arrozC.getStock());
		assertEquals(9,arrozE.getStock());
		
	}
	
	@Test
	void testCajaMontoAPagarProducto() {
		
		cliente1.agregarProducto(arrozE);
		cliente1.agregarProducto(arrozE);
		cliente1.agregarProducto(arrozE);
		
		cajaA.montoTotalAPagarDelCliente(cliente1);
		assertEquals(150,cliente1.getSaldoAPagar());
		
		cliente2.agregarProducto(fideoC);
		assertEquals(27,fideoC.calcularPrecio());
		
		cliente2.agregarProducto(fideoC);
		cliente2.agregarProducto(fideoE);
		
		cajaB.montoTotalAPagarDelCliente(cliente2);
		assertEquals(74,cliente2.getSaldoAPagar());
	}
	
	@Test
	void testCajaMontoAPagarServicio() {
			
		cliente1.agregarProducto(cable);
		cliente1.agregarProducto(telefono);
			
		cliente2.agregarProducto(telefono);
		cliente2.agregarProducto(telefono);
		
		cajaA.montoTotalAPagarDelCliente(cliente1);
		assertEquals(400,cliente1.getSaldoAPagar());
		
		cajaB.montoTotalAPagarDelCliente(cliente2);
		assertEquals(400,cliente2.getSaldoAPagar());
		
	}
	
	@Test
	void testImpuestos() {
		
		cliente1.agregarProducto(cable);
		cliente1.agregarProducto(telefono);
		cliente1.agregarProducto(impuestoA);
			
		cliente2.agregarProducto(telefono);
		cliente2.agregarProducto(telefono);
		cliente2.agregarProducto(seguridad);
		
		cajaA.montoTotalAPagarDelCliente(cliente1);
		assertEquals(450,cliente1.getSaldoAPagar());
		
		cajaB.montoTotalAPagarDelCliente(cliente2);
		assertEquals(600,cliente2.getSaldoAPagar());
		
		
		
	}

}
