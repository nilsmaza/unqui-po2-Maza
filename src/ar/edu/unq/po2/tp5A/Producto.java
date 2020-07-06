package ar.edu.unq.po2.tp5A;

public abstract class Producto implements CobrableEnCaja {
	
	private double precio;
	private int stock;
	
	public Producto(double precio, int stock) {
		super();
		this.precio = precio;
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	
	public void descontarStock() {
		this.stock--;
	}
	
	public abstract double calcularPrecio();
	
	public void cobrarseEnCaja(Caja caja) {
		if(this.getStock() > 0){
			caja.agregarPrecioAlMonto(this.calcularPrecio());
			this.descontarStock();
		}
	}
	
}
