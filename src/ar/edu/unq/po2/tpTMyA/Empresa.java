package ar.edu.unq.po2.tpTMyA;

import java.util.ArrayList;

public class Empresa {
	
	private String nombre;
	private ArrayList<Empleado> empleados;
	
	public Empresa(String nombre, ArrayList<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.empleados = new ArrayList<Empleado>();
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
	
	
	

}
