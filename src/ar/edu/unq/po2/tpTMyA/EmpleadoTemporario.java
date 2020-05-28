package ar.edu.unq.po2.tpTMyA;

public class EmpleadoTemporario extends Empleado {

	public EmpleadoTemporario(String nombre, Integer horasDeTrabajo, double sueldoBasico, boolean estadoCivil,
			Integer hijos) {
		super(nombre, horasDeTrabajo, sueldoBasico, estadoCivil, hijos);
	}
	
	public double sueldoPorHora() {
		return super.getHorasDeTrabajo() * 5 ;
	}
	
	public double sueldoPorHijoOEstadoCivil(){
		if(super.getHijos()> 0 || super.getEstadoCivil()) {
			return 100;
		}else{
			return 0;
		}
	}

	@Override
	public double calcularSueldo() {
		return this.sueldoPorHora() + super.getSueldoBasico() + this.sueldoPorHijoOEstadoCivil();
	}
	
	

}
