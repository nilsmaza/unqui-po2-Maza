package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	protected double precio;
	private boolean precioCuidados;
	
	public Producto(String nombre, double precio, boolean precioCuidados) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidados = precioCuidados;
	}
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidados = false;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return precioCuidados;
	}

	public void setPrecioCuidado(boolean precioCuidados) {
		this.precioCuidados = precioCuidados;
	}
	
	public void aumentarPrecio(double numero) {
		this.precio += numero;
	}
	
}
