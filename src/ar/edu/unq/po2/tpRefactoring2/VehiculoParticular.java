package ar.edu.unq.po2.tpRefactoring2;

import java.time.LocalDate;

public class VehiculoParticular extends Vehiculo {

	public VehiculoParticular(LocalDate fechaFabricacion, String ciudadRadicacion) {
		super(fechaFabricacion, ciudadRadicacion);
	}

	@Override
	public boolean permitirRealizacionDeLaVtv(LocalDate fecha) {
		return fecha.minusYears(1).isAfter(this.getFechaFabricacion())
				&& this.ciudadRadicacion().equalsIgnoreCase("Buenos Aires");
	}

}
