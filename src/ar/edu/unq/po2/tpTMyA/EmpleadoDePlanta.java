package ar.edu.unq.po2.tpTMyA;

public class EmpleadoDePlanta extends Empleado {

	public EmpleadoDePlanta(String nombre, Integer horasDeTrabajo, double sueldoBasico, boolean estadoCivil,
			Integer hijos) {
		super(nombre, horasDeTrabajo, sueldoBasico, estadoCivil, hijos);
	}

	@Override
	public double calcularSueldo() {	
		return super.getSueldoBasico() + this.sueldoPorHijo();
	}
	
	public double sueldoPorHijo() {
		return super.getHijos() * 150;
	}
	
	

}
