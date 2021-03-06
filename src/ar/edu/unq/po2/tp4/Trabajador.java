package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresosPercibidosPorAņo = new ArrayList<Ingreso>();

	public ArrayList<Ingreso> getIngresosPercibidosPorAņo() {
		return ingresosPercibidosPorAņo;
	}
	
	public void agregarIngreso(Ingreso nuevoIngreso) {
		this.getIngresosPercibidosPorAņo().add(nuevoIngreso);
	}
	
	public double getTotalPercibido() {
		double  totalPercibido = 0;
		for(Ingreso ingreso : ingresosPercibidosPorAņo ) {
			totalPercibido += ingreso.getMonto();
		}
		return totalPercibido;
	}
	
	
	public double getMontoImponible() {
		double montoImponible = 0;
		for (Ingreso ingreso : ingresosPercibidosPorAņo) {
			montoImponible += ingreso.getMontoImponible();
		}
		return montoImponible;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() / 100 * 2 ;
	}

}
