package ar.edu.unq.po2.tpObserver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArticuloTest {
	
	private Investigador juanInv;
	private Investigador mariaInv;
	private Investigador pedroInv;
	private Articulo articuloSalud;
	private Articulo articuloJuan;
	private SistemaDeArticulos biblioteca;


	@BeforeEach
	void setUp() {
		
		juanInv = new Investigador("Juan");
		mariaInv = new Investigador("Maria");
		pedroInv = new Investigador("Pedro");
		
		articuloSalud = new Articulo("Mediciana Avnazada","Carlos","Universidad","articulo", "BuenosAires", "salud");
		articuloJuan = new Articulo("Casos de enfermedades", "Juan", "Universidad","articulo", "Capital", "enfermedades");
		
		//biblioteca = new SistemaDeArticulos();
	}

	@Test
	void testSuscribirse() {
		
		
		biblioteca = new SistemaDeArticulos();
		
		juanInv.setSistema(biblioteca);
		mariaInv.setSistema(biblioteca);
		
		assertEquals(0,biblioteca.getObservadores().size());
		juanInv.suscribirse();
		
		assertEquals(1,biblioteca.getObservadores().size());
		mariaInv.suscribirse();
		assertEquals(2,biblioteca.getObservadores().size());
		mariaInv.meInteresan("salud");
	
		juanInv.meInteresan("Pedro");
		
		
			
	}
	
	@Test
	void testInteres() {
		
		biblioteca = new SistemaDeArticulos();
		
		juanInv.setSistema(biblioteca);
		mariaInv.setSistema(biblioteca);
		
		juanInv.suscribirse();
		mariaInv.suscribirse();
		
		mariaInv.meInteresan("salud");
		juanInv.meInteresan("Pedro");
		
		biblioteca.agregarArticulo(articuloSalud); //notifica
		biblioteca.agregarArticulo(articuloJuan); //no notifica
		
		pedroInv.setSistema(biblioteca);
		
		pedroInv.subirArticulo("Mi investigacion", "Universidad", "articulo", "BuenosAires", "salud"); //2 notificaciones
	}

}
