package ar.edu.unq.po2.tpTMyA;

public abstract class Empleado implements InterfaceEmpleado {
	
	private String nombre;
	private Integer horasDeTrabajo;
	private double SueldoBasico;
	private boolean estadoCivil;
	private Integer hijos;
	
	public Empleado(String nombre, Integer horasDeTrabajo, double sueldoBasico, boolean estadoCivil, Integer hijos) {
		super();
		this.nombre = nombre;
		this.horasDeTrabajo = horasDeTrabajo;
		this.SueldoBasico = sueldoBasico;
		this.estadoCivil = estadoCivil;
		this.hijos = hijos;
	}

	public Integer getHijos() {
		return hijos;
	}

	public void setHijos(Integer hijos) {
		this.hijos = hijos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getHorasDeTrabajo() {
		return horasDeTrabajo;
	}

	public void setHorasDeTrabajo(Integer horasDeTrabajo) {
		this.horasDeTrabajo = horasDeTrabajo;
	}

	public double getSueldoBasico() {
		return SueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		SueldoBasico = sueldoBasico;
	}

	public boolean getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public double aportesYObraSocial() {
		return this.calcularSueldo() * 0.13;
	}
	
	public double sueldoDelEmpleado() {
		double sueldo =this.calcularSueldo() ;
			sueldo -= this.aportesYObraSocial();
		return sueldo;
	}
	
	public abstract double calcularSueldo();

	
}
