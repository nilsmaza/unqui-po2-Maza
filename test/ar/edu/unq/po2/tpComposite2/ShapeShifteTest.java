package ar.edu.unq.po2.tpComposite2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeShifteTest {
	
	private ShapeShifte shapeShifteA;
	private ShapeShifte shapeShifteB;
	private ShapeShifte shapeShifteD;
	private ShapeShifte shapeShifte5;
	private ShapeShifte shapeShifte6;
	

	@BeforeEach
	void setUp(){
		
		shapeShifteA = new ShapeShifte(1);
		shapeShifteB = new ShapeShifte(2);
		shapeShifteD = new ShapeShifte(3);
		shapeShifte5 = new ShapeShifte(5);
		shapeShifte6 = new ShapeShifte(6);
		
	}

	@Test
	void testCompose() {
		
		ShapeShifte shapeShifteC = shapeShifteA.compose(shapeShifteB);
		assertTrue(shapeShifteC.getListaDeShapeShifte().contains(shapeShifteA));
		assertTrue(shapeShifteC.getListaDeShapeShifte().contains(shapeShifteB));
		
		ShapeShifte shapeShifteD2 = shapeShifteD.compose(shapeShifteC);
		assertTrue(shapeShifteD2.getListaDeShapeShifte().contains(shapeShifteD));
		assertTrue(shapeShifteD2.getListaDeShapeShifte().contains(shapeShifteC));
		
		ShapeShifte shapeShifteE = shapeShifte5.compose(shapeShifte6);
		
		ShapeShifte shapeShifteF = shapeShifteD2.compose(shapeShifteE);
		assertTrue(shapeShifteF.getListaDeShapeShifte().contains(shapeShifteD2));
		assertTrue(shapeShifteF.getListaDeShapeShifte().contains(shapeShifteE));
		
	}
	
	@Test
	void testdeepest() {
		
		ShapeShifte shapeShifteC = shapeShifteA.compose(shapeShifteB);
		
		ShapeShifte shapeShifteE = shapeShifte5.compose(shapeShifte6);
		ShapeShifte shapeShifteD2 = shapeShifteD.compose(shapeShifteC);
		ShapeShifte shapeShifteF = shapeShifteD2.compose(shapeShifteE);
		
		assertEquals(0,shapeShifteA.deepest());
		assertEquals(1,shapeShifteC.deepest());
		assertEquals(3,shapeShifteF.deepest());
		
	}
	
	@Test
	void testflat() {
		
		ShapeShifte shapeShifteC = shapeShifteA.compose(shapeShifteB);
		
		ShapeShifte shapeShifteE = shapeShifte5.compose(shapeShifte6);
		ShapeShifte shapeShifteD2 = shapeShifteD.compose(shapeShifteC);
		ShapeShifte shapeShifteF = shapeShifteD2.compose(shapeShifteE);
		
		assertEquals(shapeShifteA,shapeShifteA.flat());
		
		shapeShifteF.flat();
		assertEquals(5,shapeShifteF.getListaDeShapeShifte().size());
		
	}
	
	@Test
	void testvalues() {
		
		assertTrue(shapeShifteA.values().contains(1));
		
		ShapeShifte shapeShifteC = shapeShifteA.compose(shapeShifteB);
		ShapeShifte shapeShifteD2 = shapeShifteD.compose(shapeShifteC);
		
		assertTrue(shapeShifteD2.values().contains(1));
		assertTrue(shapeShifteD2.values().contains(2));
		assertTrue(shapeShifteD2.values().contains(3));
		
	}

}
