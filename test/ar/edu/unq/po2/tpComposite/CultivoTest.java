package ar.edu.unq.po2.tpComposite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CultivoTest {

	private CultivoMultiple cultivo1;
	private CultivoMultiple cultivo2;
	private Soja soja;
	private Trigo trigo;
	
	
	@BeforeEach
	void setUp() {
		
		cultivo1 = new CultivoMultiple();
		cultivo2 = new CultivoMultiple();
		soja = new Soja(500);
		trigo = new Trigo(300);

		
		cultivo2.cultivarPlanta(soja);
		cultivo2.cultivarPlanta(soja);
		cultivo2.cultivarPlanta(trigo);
		cultivo2.cultivarPlanta(trigo);
		
		cultivo1.cultivarPlanta(soja);
		cultivo1.cultivarPlanta(trigo);
		cultivo1.cultivarPlanta(cultivo2);
		cultivo1.cultivarPlanta(soja);

	}
	
	@Test
	void testCultivo2Costo() {

		assertEquals(cultivo2.CostoDelCultivo(),1600);
		assertEquals(cultivo2.getZonaDeCultivosDisponibles(),0);
		
	}
	
	@Test
	void testCultivo1Costo() {
		
		assertEquals(cultivo1.CostoDelCultivo(),1700);       //ejemplo de la pactica
		assertEquals(cultivo1.getZonaDeCultivosDisponibles(),0);
		
	}

}
