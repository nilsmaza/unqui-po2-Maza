package ar.edu.unq.po2.tp7Ejercicio5;

import com.sun.tools.javac.util.List;

public abstract class CuentaBancaria {
	
	private String titular;
	private int saldo;
	private List<String> movimientos;
	
	public String getTitular() {
		return this.titular;
	}

	public int getSaldo() {
		return this.saldo;
	}

	protected void setSaldo(int monto) {
		this.saldo = monto;
	}

	public void agregarMovimientos(String movimiento) {
		this.movimientos.add(movimiento);
	}

	public  void extraer(int monto) {
		if (this.permitirExtraccionDeDiniero(monto)) {
			this.setSaldo(this.getSaldo() - monto);
			this.agregarMovimientos("Extraccion");
		}
	}
	
	public abstract boolean permitirExtraccionDeDiniero(int monto);
	
}
