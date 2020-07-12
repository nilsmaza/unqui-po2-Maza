package ar.edu.unq.po2.tp5B;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonasYMascotas {
	
	private Persona juan;
	private Persona maria;
	private Perro fido;
	private Gato michi;

	@BeforeEach
	void setUp() {
		
		juan = new Persona("Juan", LocalDate.of(2001,2,10));
		maria = new Persona("Maria",LocalDate.of(1998,7,20));
		fido = new Perro("Fido", "Pastor Aleman");
		michi = new Gato("Michi","Persa");
	}


	@Test
	void testColeccionDeNombre() {
		
		ArrayList<IdentidadPorNombre> lista = new ArrayList<IdentidadPorNombre>();
		lista.add(fido);
		lista.add(maria);
		lista.add(juan);
		lista.add(michi);
		
		assertEquals("Fido",lista.get(0).getNombre());
		assertEquals("Maria",lista.get(1).getNombre());
		assertEquals("Juan",lista.get(2).getNombre());
		assertEquals("Michi",lista.get(3).getNombre());
		
		ArrayList<String> listaDeNombre = new ArrayList<String>();
		
		listaDeNombre.add(lista.get(0).getNombre());
		listaDeNombre.add(lista.get(1).getNombre());
		listaDeNombre.add(lista.get(2).getNombre());
		listaDeNombre.add(lista.get(3).getNombre());
		
		assertEquals(4,listaDeNombre.size());
	}

}
