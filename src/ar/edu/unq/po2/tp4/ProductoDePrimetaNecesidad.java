package ar.edu.unq.po2.tp4;

public class ProductoDePrimetaNecesidad extends Producto {
	
	private double descuentoPorProducto ;

	public ProductoDePrimetaNecesidad(String nombre, double precio, boolean precioCuidados,double descuento) {
		super(nombre, precio, precioCuidados);
		this.setDescuentoPorProducto(descuento);
	}

	public double getDescuentoPorProducto() {
		return descuentoPorProducto;
	}

	public void setDescuentoPorProducto(double descuentoPorProducto) {
		this.descuentoPorProducto = descuentoPorProducto;
	}
	
	public double getPrecio() {
		Double descuento = super.getPrecio() * this.getDescuentoPorProducto() / 100;
		return  super.getPrecio() - descuento  ;
	}

}
