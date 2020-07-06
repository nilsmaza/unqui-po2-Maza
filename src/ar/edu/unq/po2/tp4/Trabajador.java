package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresosPercibidosPorAño = new ArrayList<Ingreso>();

	public ArrayList<Ingreso> getIngresosPercibidosPorAño() {
		return ingresosPercibidosPorAño;
	}
	
	public void agregarIngreso(Ingreso nuevoIngreso) {
		this.getIngresosPercibidosPorAño().add(nuevoIngreso);
	}
	
	public double getTotalPercibido() {
		double  totalPercibido = 0;
		for(Ingreso ingreso : ingresosPercibidosPorAño ) {
			totalPercibido += ingreso.getMonto();
		}
		return totalPercibido;
	}
	
	
	public double getMontoImponible() {
		double montoImponible = 0;
		for (Ingreso ingreso : ingresosPercibidosPorAño) {
			montoImponible += ingreso.getMontoImponible();
		}
		return montoImponible;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() / 100 * 2 ;
	}

}
