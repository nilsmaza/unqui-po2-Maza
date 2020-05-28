package ar.edu.unq.po2.tp3;

import java.util.Calendar;
import sun.util.calendar.BaseCalendar.Date;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento; //año de nacimiento
	
	public Persona(String nombre, String apellido , Date fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int calcularEdad() {
			Calendar fechaActual = Calendar.getInstance(); 
			int edad = fechaActual.get(Calendar.YEAR) - this.getFechaDeNacimiento().getYear();
		return edad;
	}
	
	public boolean menorQue(Persona unaPersona) {
		return this.calcularEdad() < unaPersona.calcularEdad();	
	}
	
	
	
}
