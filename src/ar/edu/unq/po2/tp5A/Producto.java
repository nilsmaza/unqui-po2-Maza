package ar.edu.unq.po2.tp5A;

public abstract class Producto implements CobrableEnCaja {
	
	private double precio;
	private Integer stock;
	
	public Producto(double precio, Integer stock) {
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

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	public void descontarStock() {
		this.stock--;
	}
	
	public abstract double calcularPrecio();
	
	public void cobrarseEnCaja(Caja caja) {
		if(this.getStock() >0) {
			caja.agregarPrecioAlMonto(this.calcularPrecio());
			this.descontarStock();
		}
	}
	

}
