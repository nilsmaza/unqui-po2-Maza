package ar.edu.unq.po2.tp5;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {

	public SolicitudDeCreditoPersonal(Cliente cliente, double montoSolicitado, Integer plazoDeMeses) {
		super(cliente, montoSolicitado, plazoDeMeses);
	}
	
	public boolean chequeoDeAceptacion() {
		return this.chequeoPorIngresoAnual() && this.chequeoPorLimiteDeMonto();
	}
	
	public boolean chequeoPorIngresoAnual() {
		return super.getCliente().sueldoNetoAnual() >= 15000;
	}
	
	public boolean chequeoPorLimiteDeMonto() {
		double limite = super.getCliente().porcentajeDeSueldoMensual(70) ;
		return limite > super.montoDeLaCuotaMensual();
	}
	

}
