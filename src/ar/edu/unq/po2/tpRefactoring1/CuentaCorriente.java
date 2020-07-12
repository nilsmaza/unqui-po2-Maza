package ar.edu.unq.po2.tpRefactoring1;

public class CuentaCorriente extends CuentaBancaria{
	private Integer limiteDescubierto;
	
	public CuentaCorriente(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo, Integer limiteDescubierto) {
		super(historialDeMovimientos, notificador, saldo);
		this.limiteDescubierto = limiteDescubierto;
	}

	@Override
	public boolean extraccionPosible(Integer monto) {
		return this.getSaldo() + this.limiteDescubierto >= monto;
	}
	
/*	codigosRepetidos
	 la subclase accede directamente a las variables de su superclase
	@Override
	public void extraer(Integer monto) {
		if(this.saldo + this.limiteDescubierto >= monto)
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
	}
*/
}
