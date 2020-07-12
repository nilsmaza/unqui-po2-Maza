package ar.edu.unq.po2.tp5B;

public abstract class Mascota implements IdentidadPorNombre{

	private String nombre;
	private String raza;
	
	public Mascota(String nombre, String raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
}
