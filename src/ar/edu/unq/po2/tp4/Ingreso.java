package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	private String mesDePercepcion;
	private String concepto;
	private double monto;
	
	public Ingreso(String mesDePercepcion, String concepto, double monto) {
		super();
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.monto = monto;
	}

	public String getMesDePercepcion() {
		return mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	public double getMonto() {
		return this.monto;
	}

	public double getMontoImponible() {
		return this.getMonto();
	}
	
}
