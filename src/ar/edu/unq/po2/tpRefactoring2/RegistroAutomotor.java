package ar.edu.unq.po2.tpRefactoring2;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {
		return vehiculo.permitirRealizacionDeLaVtv(fecha);
	}
/* no son necesarios
	->	LocalDate fechaFabricacion = vehiculo.getFechaFabricacion();
	->	Boolean esVehiculoPolicial = vehiculo.esVehiculoPolicial();
	->	String ciudadRadicacion = vehiculo.ciudadRadicacion();
		
		// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
		// sólo realizan vtv los vehículos con más de 1 anio de antiguedad y radicados
		// en 'Buenos Aires'
		return (!esVehiculoPolicial && fecha.minusYears(1).isAfter(fechaFabricacion)
				&& ciudadRadicacion.equalsIgnoreCase("Buenos Aires")); 
				-> pasan como condicion en las subClases de la clase Vehiculos <-

*/	
}
