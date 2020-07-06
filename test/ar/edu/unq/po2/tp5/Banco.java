package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class Banco {//TP 6
	
	private BancoA bancoCentral;
	private Cliente clienteA;
	private Cliente clienteB;
	private Cliente clienteC;
	private SolicitudDeCreditoHipotecario cHipotecario;
	private SolicitudDeCreditoPersonal cPersonal;
	private PropiedadInmobiliaria propiedadC;
	private PropiedadInmobiliaria propiedadCasa;
	private PropiedadInmobiliaria propiedadD;
	

	@BeforeEach
	void setUp(){
		
		bancoCentral = new BancoA();
		propiedadC = new PropiedadInmobiliaria("Casa", "Direccion", 500000);
		propiedadCasa = new PropiedadInmobiliaria("Casa", "Direccion", 200000);
		propiedadD = new PropiedadInmobiliaria("Departamento", "Direccion", 100000);
		cHipotecario = new SolicitudDeCreditoHipotecario(null, 0, null, null);
		cPersonal = new SolicitudDeCreditoPersonal(null, 0, null);
		clienteA = new Cliente("Juan", "A", " ", 40, 25000, propiedadCasa, 0);
		clienteB = new Cliente("Maria", "B", " ", 70, 40000, propiedadC, 0);
		clienteC = new Cliente("Carlos", "C", " ", 35, 15000, propiedadD, 0);
		
	}


	@Test
	void testAgregarClienteAlBanco() {
		
		bancoCentral.agregarCliente(clienteA);
		bancoCentral.agregarCliente(clienteB);
		bancoCentral.agregarCliente(clienteC);
		
		assertEquals(3,bancoCentral.getClientes().size());
		assertEquals(0,bancoCentral.getSolicitudes().size());
		
	}
	
	@Test
	void testChequoDeSolicitud() {
		
		cHipotecario = new SolicitudDeCreditoHipotecario(clienteB, 20000, 8, propiedadC);
		SolicitudDeCreditoPersonal cPersonalclienteB = new SolicitudDeCreditoPersonal(clienteB, 20000, 5);
		
		cPersonal = new SolicitudDeCreditoPersonal(clienteC, 20000, 5);
		SolicitudDeCreditoHipotecario cHipotecarioclienteC = new SolicitudDeCreditoHipotecario(clienteC, 20000, 5,propiedadD);
		
		assertFalse(cHipotecario.chequeoDeAceptacion()); //false por edad
		assertTrue(cHipotecario.chequeoDeCuota());
		assertTrue(cHipotecario.chequeoDeValorFiscal());
		assertFalse(cHipotecario.chequeoPorEdad());
		
		assertTrue(cPersonalclienteB.chequeoDeAceptacion()); // todo Aceptable
		assertTrue(cPersonalclienteB.chequeoPorIngresoAnual());
		assertTrue(cPersonalclienteB.chequeoPorLimiteDeMonto());
			
		assertTrue(cPersonal.chequeoDeAceptacion());        //todo Aceptable
		assertTrue(cPersonal.chequeoPorIngresoAnual());
		assertTrue(cPersonal.chequeoPorLimiteDeMonto());
		
		assertFalse(cHipotecarioclienteC.chequeoDeAceptacion());  // false por Cuota
		assertFalse(cHipotecarioclienteC.chequeoDeCuota());
		assertTrue(cHipotecarioclienteC.chequeoDeValorFiscal());
		assertTrue(cHipotecarioclienteC.chequeoPorEdad());
		
		SolicitudDeCreditoPersonal cPersonalclienteA = new SolicitudDeCreditoPersonal(clienteA, 10000, 4);
		SolicitudDeCreditoHipotecario cHipotecarioclienteA = new SolicitudDeCreditoHipotecario(clienteA, 12000, 10,propiedadC);
		
		assertTrue(cPersonalclienteA .chequeoDeAceptacion());        //todo Aceptable
		assertTrue(cPersonalclienteA .chequeoPorIngresoAnual());
		assertTrue(cPersonalclienteA .chequeoPorLimiteDeMonto());
		
	
		assertTrue(cHipotecarioclienteA.chequeoDeAceptacion());  //todo Aceptable
		assertTrue(cHipotecarioclienteA.chequeoDeCuota());
		assertTrue(cHipotecarioclienteA.chequeoDeValorFiscal());
		assertTrue(cHipotecarioclienteA.chequeoPorEdad());
		
	}
	@Test
	void testMontoADesenvolsarUnaSolaSolicitud() {
		
		cHipotecario = new SolicitudDeCreditoHipotecario(clienteB, 20000, 8, propiedadC);
		cPersonal = new SolicitudDeCreditoPersonal(clienteC, 20000, 5);
		
		bancoCentral.agregarCliente(clienteB);
		bancoCentral.agregarCliente(clienteC);
		
		bancoCentral.agregarSolicitud(cHipotecario);
		bancoCentral.agregarSolicitud(cPersonal);
		
		assertEquals(20000,bancoCentral.montoTotalADesembolsar());
		
	}
	
	@Test
	void testMontoADesenvolsarDe3Solicitudes() {
		
		cPersonal = new SolicitudDeCreditoPersonal(clienteC, 20000, 5);
		cHipotecario = new SolicitudDeCreditoHipotecario(clienteB, 20000, 8, propiedadC);
		SolicitudDeCreditoPersonal cPersonalclienteB = new SolicitudDeCreditoPersonal(clienteB, 20000, 5);
		SolicitudDeCreditoHipotecario cHipotecarioclienteA = new SolicitudDeCreditoHipotecario(clienteA, 12000, 10,propiedadC);
		
		bancoCentral.agregarCliente(clienteB);
		bancoCentral.agregarCliente(clienteC);
		bancoCentral.agregarCliente(clienteA);
		
		bancoCentral.agregarSolicitud(cHipotecario);
		bancoCentral.agregarSolicitud(cPersonal);
		bancoCentral.agregarSolicitud(cPersonalclienteB);
		bancoCentral.agregarSolicitud(cHipotecarioclienteA);
		
		assertEquals(52000,bancoCentral.montoTotalADesembolsar());
		
	}

}
