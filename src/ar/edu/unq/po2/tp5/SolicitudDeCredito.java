package ar.edu.unq.po2.tp5;

public abstract class SolicitudDeCredito {

	private Cliente cliente;
	private double montoSolicitado;
	private Integer plazoDeMeses;
	
	public SolicitudDeCredito(Cliente cliente, double montoSolicitado, Integer plazoDeMeses) {
		super();
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoDeMeses = plazoDeMeses;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}

	public Integer getPlazoDeMeses() {
		return plazoDeMeses;
	}

	public void setPlazoDeMeses(Integer plazoDeMeses) {
		this.plazoDeMeses = plazoDeMeses;
	}
	
	public double montoDeLaCuotaMensual() {
		return this.getMontoSolicitado() / this.getPlazoDeMeses();
	}
	
	abstract public boolean chequeoDeAceptacion();
	
}
