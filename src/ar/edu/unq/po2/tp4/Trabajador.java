package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresosPercibidosPorA�o = new ArrayList<Ingreso>();

	public ArrayList<Ingreso> getIngresosPercibidosPorA�o() {
		return ingresosPercibidosPorA�o;
	}
	
	public void agregarIngreso(Ingreso nuevoIngreso) {
		this.getIngresosPercibidosPorA�o().add(nuevoIngreso);
	}
	
	public double getTotalPercibido() {
		double  totalPercibido = 0;
		for(Ingreso ingreso : ingresosPercibidosPorA�o ) {
			totalPercibido += ingreso.getMonto();
		}
		return totalPercibido;
	}
	
	
	public double getMontoImponible() {
		double montoImponible = 0;
		for (Ingreso ingreso : ingresosPercibidosPorA�o) {
			montoImponible += ingreso.getMontoImponible();
		}
		return montoImponible;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() / 100 * 2 ;
	}

}
