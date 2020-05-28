package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos = new ArrayList<Producto>() ;
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public void agregarProducto(Producto nunevoProducto) {
		this.getProductos().add(nunevoProducto);
	}
	
	public void removerProducto(Producto producto) {
		this.getProductos().remove(producto);
	}
	
	public int getCantidadDeProductos() {
		return this.getProductos().size();
	}
	
	public double sumaTotalDeProductos() {
		double sumaTotal = 0;
			for(Producto producto : productos) {
				sumaTotal += producto.getPrecio();
			}
		return sumaTotal;
	}
}
