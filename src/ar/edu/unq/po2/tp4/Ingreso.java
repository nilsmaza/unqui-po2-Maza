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

	public void setMesDePercepcion(String mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public double getMonto() {
		return this.monto;
	}

	public double getMontoImponible() {
		return this.getMonto();
	}
	
}
