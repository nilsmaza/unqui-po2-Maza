package ar.edu.unq.po2.tpTMyA;

public class EmpleadoPasante extends Empleado{

	public EmpleadoPasante(String nombre, Integer horasDeTrabajo, Integer sueldoBasico, boolean estadoCivil, Integer hijos) {
		super(nombre, horasDeTrabajo, sueldoBasico, estadoCivil, hijos);
	}
		
	public double sueldoPorHora() {
		return super.getHorasDeTrabajo() * 40 ;
	}
	@Override
	public double calcularSueldo() {
		return this.sueldoPorHora();
	}

}
