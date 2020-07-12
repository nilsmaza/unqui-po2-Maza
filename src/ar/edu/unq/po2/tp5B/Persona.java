package ar.edu.unq.po2.tp5B;

import java.time.LocalDate;

public class Persona implements IEdad,IdentidadPorNombre{
	
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		super();
		this.setNombre(nombre);
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getEdad() {
		LocalDate fechaActual = LocalDate.now(); 
		int edad = fechaActual.getYear() - fechaDeNacimiento.getYear();
	return edad;
	}
	
	public boolean mayorA(IEdad interfaceEdad) {
		return this.getEdad() > interfaceEdad.getEdad();
	}
	
	public boolean menorA(IEdad interfaceEdad) {
		return this.getEdad() < interfaceEdad.getEdad();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
