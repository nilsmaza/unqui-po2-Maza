package ar.edu.unq.po2.tp3;

import java.util.Calendar;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Calendar fechaDeNacimiento; //año de nacimiento
	
	public Persona(String nombre, String apellido , Calendar fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return apellido;
	}

	public  Calendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public int calcularEdad() {
			Calendar fechaActual = Calendar.getInstance(); 
			int edad = fechaActual.get(Calendar.YEAR) - this.getFechaDeNacimiento().getWeekYear();
		return edad;
	}
	
	public boolean menorQue(Persona unaPersona) {
		return this.calcularEdad() < unaPersona.calcularEdad();	
	}
	
	
	
}
