package ar.edu.unq.po2.tp7Ejercicio5;

public class CuentaCorriente extends CuentaBancaria{
	
	private int descubierto;
	
	public CuentaCorriente(int descubierto) {
		super();
		this.descubierto = descubierto;
	}

	public int getDescubierto(){
	return this.descubierto;
	}

	@Override
	public boolean permitirExtraccionDeDiniero(int monto) {
		return monto < this.getSaldo() + this.getDescubierto();
	}

}
