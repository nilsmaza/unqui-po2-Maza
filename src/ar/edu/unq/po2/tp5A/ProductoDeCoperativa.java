package ar.edu.unq.po2.tp5A;

public class ProductoDeCoperativa extends Producto{

	public ProductoDeCoperativa(double precio, int stock) {
		super(precio, stock);
	}
	
	public double apilcarDescuentoIVA() {
		return this.getPrecio() * 10 / 100 ;
	}
	
	public double calcularPrecio() {
		double precioActualizado;
			precioActualizado = this.getPrecio() - this.apilcarDescuentoIVA();
		return precioActualizado;
	}

}
