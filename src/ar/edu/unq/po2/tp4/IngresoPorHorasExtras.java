package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso{
	
	private int cantidadDeHoresExtras ;

	public IngresoPorHorasExtras(String mesDePercepcion, String concepto, double montoPercibido,
			int cantidadDeHoresExtras) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.cantidadDeHoresExtras = cantidadDeHoresExtras;
	}

	public int getCantidadDeHoresExtras() {
		return cantidadDeHoresExtras;
	}

	public void setCantidadDeHoresExtras(int cantidadDeHoresExtras) {
		this.cantidadDeHoresExtras = cantidadDeHoresExtras;
	}
	
	public double getMontoImponible() {
		return 0;
	}

}
