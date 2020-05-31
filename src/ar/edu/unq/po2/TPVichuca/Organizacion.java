package ar.edu.unq.po2.TPVichuca;

public abstract class Organizacion {
	
	private Ubicacion ubicacion;
	private Integer cantidadePersonas;
	
	public Organizacion(Ubicacion ubicacion, Integer cantidadePersonas) {
		super();
		this.ubicacion = ubicacion;
		this.cantidadePersonas = cantidadePersonas;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Integer getCantidadePersonas() {
		return cantidadePersonas;
	}

	public void setCantidadePersonas(Integer cantidadePersonas) {
		this.cantidadePersonas = cantidadePersonas;
	}
	
}
