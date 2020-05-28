package ar.edu.unq.po2.tp5;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {

	public SolicitudDeCreditoHipotecario(Cliente cliente, double montoSolicitado, Integer plazoDeMeses,PropiedadInmobiliaria propiedad) {
		super(cliente, montoSolicitado, plazoDeMeses);
	}
	
	public boolean chequeoDeAceptacion() {
		return  this.chequeoDeCuota() && this.chequeoDeValorFiscal() && this.chequeoPorEdad();
			//this.getCliente().porcentajeDeSueldoMensual(50) > this.montoDeLaCuotaMensual() &&
			//this.getMontoSolicitado() < this.getPropiedad().porcentajeDelValorFiscal(70) && 
			//this.getCliente().getEdad() < 65;
	}
	
	public boolean chequeoPorEdad() {
		Integer EdadDelCliente = super.getCliente().getEdad();
		return EdadDelCliente + this.añoAPagar() < 65;
	}
	
	public Integer añoAPagar() {
		Integer plazoDelCliente = super.getPlazoDeMeses();
		 if(plazoDelCliente <= 12) {
			 return 1;
		 }else{
			 return 2;
		 }
	 }
	
	public boolean chequeoDeValorFiscal() {
		double valorDelCliente = super.getCliente().getPropiedad().porcentajeDelValorFiscal(70);
		double montoSolicitadoPorElCliente = super.getMontoSolicitado();
		return valorDelCliente > montoSolicitadoPorElCliente;
	}
	
	public boolean chequeoDeCuota() {
		double montoLimiteParaElCliente = super.getCliente().porcentajeDeSueldoMensual(50);
		return montoLimiteParaElCliente >= super.getMontoSolicitado();
	}

}
