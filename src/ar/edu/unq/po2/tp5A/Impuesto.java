package ar.edu.unq.po2.tp5A;

public class Impuesto extends Factura{
	
	private double costoFijo;

	public Impuesto(double costoFijo) {
		super();
		this.costoFijo = costoFijo;
	}
	
	public double calcularPrecio() {
		return this.costoFijo;
	}
	

}
