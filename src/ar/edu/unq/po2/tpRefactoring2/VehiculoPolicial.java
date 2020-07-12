package ar.edu.unq.po2.tpRefactoring2;

import java.time.LocalDate;

public class VehiculoPolicial extends Vehiculo{

	public VehiculoPolicial( LocalDate fechaFabricacion, String ciudadRadicacion) {
		super(fechaFabricacion, ciudadRadicacion);
	}

	public boolean permitirRealizacionDeLaVtv(LocalDate fecha) {
		return false;
	}
/* se crea la clase VehiculoPolicial para no depender de un booleano por parte
 *  de la clase Vehiculo y declararse vehiculo policial */	
	
}
