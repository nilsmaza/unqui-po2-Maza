package ar.edu.unq.po2.tp5A;

public abstract class Factura implements CobrableEnCaja {
	
	public abstract double calcularPrecio();
	
	public void cobrarseEnCaja(Caja caja) {
		caja.agregarPrecioAlMonto(this.calcularPrecio());
		caja.registraPago(this);
	}

}
