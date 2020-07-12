package ar.edu.unq.po2.tpRefactoring2;

import java.time.LocalDate;

/* pasa a ser una clase abstracta devido que hay diferentes tipos de vehiculos
   con diferente codiciones para verificacion vehicular  */

public abstract class Vehiculo {

//	private Boolean esVehiculoPolicial; no es necesario
	private LocalDate fechaFabricacion;	
	private String ciudadRadicacion; 
	
	public Vehiculo(/*Boolean esVehiculoPolicial,*/ LocalDate fechaFabricacion, String ciudadRadicacion) {
	//	this.esVehiculoPolicial = esVehiculoPolicial; no es necesario
		this.fechaFabricacion = fechaFabricacion;
		this.ciudadRadicacion = ciudadRadicacion;
	}

/*	public Boolean esVehiculoPolicial() { no es necesario
		return esVehiculoPolicial;
	}
*/
	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public String ciudadRadicacion() {
		return ciudadRadicacion;
	}
	
	public abstract boolean permitirRealizacionDeLaVtv(LocalDate fecha);
}
