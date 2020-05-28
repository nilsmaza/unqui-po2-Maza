package ar.edu.unq.po2.tp5A;

public class ProductoDeCoperativa extends Producto{

	public ProductoDeCoperativa(double precio, Integer stock) {
		super(precio, stock);
	}
	
	public double apilcarDescuentoIVA() {
		return super.getPrecio() * 10 / 100;
	}
	
	public double calcularPrecio() {
		double precioActualizado;
			precioActualizado = super.getPrecio() - this.apilcarDescuentoIVA();
		return precioActualizado;
	}

}
