package ar.edu.unq.po2.tpRefactoring1;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	@Override
	public boolean extraccionPosible(Integer monto) {
		return this.getSaldo() >= monto;
	}

/*	codigosRepetidos
	la subclase accede directamente a las variables de su superclase
	public void extraer(Integer monto) {
		if(this.saldo >= monto) {
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	}
*/	
}
