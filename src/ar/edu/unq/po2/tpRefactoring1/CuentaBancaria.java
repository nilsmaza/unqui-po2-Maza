package ar.edu.unq.po2.tpRefactoring1;

public abstract class CuentaBancaria {
	protected HistorialMovimientos historialDeMovimientos;
	protected Notificador notificador;
	protected int saldo;
	
	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public void registrarMovimiento(String operacionHecha,int monto) {
		this.historialDeMovimientos.registrarMovimiento(operacionHecha, monto);
	}
	
	public void notificarNuevoSaldoACliente() {
		this.notificador.notificarNuevoSaldoACliente(this);
	}
	
	
	// añadimos el codigo repetido de las subClases y establecemos en ella la codicion
	// para la extraccion.
	public void extraer(Integer monto) {
		if(this.extraccionPosible(monto)) {
			this.saldo = saldo - monto;
			this.registrarMovimiento("Extraccion", monto);
			this.notificarNuevoSaldoACliente();
		}
	}
	
	public abstract boolean extraccionPosible(Integer monto);
	
}
