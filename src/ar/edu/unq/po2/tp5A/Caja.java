package ar.edu.unq.po2.tp5A;

public class Caja implements Agencia{
	
	private double montoAPagar;

	public Caja() {
		super();
		this.montoAPagar = 0;
	}

	public double getMontoAPagar() {
		return montoAPagar;
	}

	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}
	
	public void montoTotalAPagarDelCliente(Cliente cliente) {
		for (CobrableEnCaja producto : cliente.getProductosAComprar()) {
			this.registrarProductoAPagar(producto);
		}
		this.informarMontoAPagarAl(cliente);
	}
	
	public void registrarProductoAPagar(CobrableEnCaja producto) {
		producto.cobrarseEnCaja(this);
	}
	
	public void agregarPrecioAlMonto(double precio) {
		this.montoAPagar += precio;
	}
	
	public void informarMontoAPagarAl(Cliente cliente) {
		cliente.setSaldoAPagar(this.getMontoAPagar());
	}

	public void registrarPago(Factura factura) {
		/* */		
	}

}
