package ar.edu.unq.po2.tp5A;

public class ProductoDeEmpresaTradicional extends Producto {

	public ProductoDeEmpresaTradicional(double precio, int stock) {
		super(precio, stock);
	}
	
	public double calcularPrecio() {
		return super.getPrecio();
	}
	
}
