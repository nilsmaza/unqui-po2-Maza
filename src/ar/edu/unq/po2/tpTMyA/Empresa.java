package ar.edu.unq.po2.tpTMyA;

import java.util.ArrayList;

public class Empresa {
	
	private String nombre;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void agregarEmpleado(Empleado nuevoEmpeleado) {
		this.getEmpleados().add(nuevoEmpeleado);
	}
	
	public void despedirEmpleado(Empleado empeleado) {
		this.getEmpleados().add(empeleado);
	}
	
	public double totalAPagarEmpleados(){
		double total = 0;
			for(Empleado empleadoActual : this.getEmpleados()) {
				total += empleadoActual.sueldoDelEmpleado();
			}
		return total;
	}

}
