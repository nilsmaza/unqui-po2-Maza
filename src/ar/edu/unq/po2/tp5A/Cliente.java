package ar.edu.unq.po2.tp5A;

import java.util.ArrayList;

public class Cliente {
	
	private String nombre;
	private ArrayList<CobrableEnCaja> productosAComprar ;
	private double saldoAPagar;

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
		this.productosAComprar = new ArrayList<CobrableEnCaja>();
		this.saldoAPagar = 0;
	}
	
	public String getNombre() {
		return nombre;
	}

	public ArrayList<CobrableEnCaja> getProductosAComprar() {
		return productosAComprar;
	}

	public void setProductosAComprar(ArrayList<CobrableEnCaja> productosAComprar) {
		this.productosAComprar = productosAComprar;
	}

	public double getSaldoAPagar() {
		return saldoAPagar;
	}

	public void setSaldoAPagar(double saldoAPagar) {
		this.saldoAPagar = saldoAPagar;
	}

	public void agregarProducto(CobrableEnCaja producto) {
			this.productosAComprar.add(producto);
	}
	

}
