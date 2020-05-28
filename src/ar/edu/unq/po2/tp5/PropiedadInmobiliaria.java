package ar.edu.unq.po2.tp5;

public class PropiedadInmobiliaria {
	
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	public PropiedadInmobiliaria(String descripcion, String direccion, double valorFiscal) {
		super();
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
	public double porcentajeDelValorFiscal(Integer numero) {
		return this.getValorFiscal() / 100 * numero;
	}
	

}
