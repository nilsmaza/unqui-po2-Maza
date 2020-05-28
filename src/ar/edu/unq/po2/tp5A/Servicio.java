package ar.edu.unq.po2.tp5A;

public abstract class Servicio extends Factura {

	private double costoPorUnidad;
	private Integer unidadesConsumidas;
	
	public Servicio(double costoPorUnidad, Integer unidadesConsumidas) {
		super();
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}
	
	public double calcularPrecio() {
		return this.costoPorUnidad * this.unidadesConsumidas;
	}
	
}
