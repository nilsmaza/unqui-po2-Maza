package ar.edu.unq.po2.tp5A;

public class Servicio extends Factura {

	private double costoPorUnidad;
	private int unidadesConsumidas;
	
	public Servicio(double costoPorUnidad, int unidadesConsumidas) {
		super();
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}
	
	public double calcularPrecio() {
		return this.costoPorUnidad * this.unidadesConsumidas;
	}

}
