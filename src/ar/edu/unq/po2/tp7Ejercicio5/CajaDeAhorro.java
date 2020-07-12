package ar.edu.unq.po2.tp7Ejercicio5;

public class CajaDeAhorro extends CuentaBancaria{

	private int limite;

	public CajaDeAhorro(int limite) {
		super();
		this.limite = limite;
	}

	public int getLimite() {
		return limite;
	}
	
	@Override
	public boolean permitirExtraccionDeDiniero(int monto) {
		return monto <= this.getSaldo() && monto <= this.getLimite();
	}



	


}
