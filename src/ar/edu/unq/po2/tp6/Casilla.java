package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class Casilla {
	
	private AlmacenamientoDeCorreos inbox;
	private AlmacenamientoDeCorreos borrados;
	
	public Casilla() {
		super();
		this.inbox = new AlmacenamientoDeCorreos();
		this.borrados = new AlmacenamientoDeCorreos();
	}
	
	public void borrarCorreo(AlmacenamientoDeCorreos almacenamiento, Correo correo) {
		almacenamiento.borrar(correo);
		if (!almacenamiento.equals(borrados)) {
			borrados.agregarNuevoCorreo(correo);
		}
	}
	
	public int cantidadDeCorreos(AlmacenamientoDeCorreos almacenamiento) {
		return almacenamiento.cantidadDeCorreos();
	}
	
	public void almacenarNuevos(ArrayList<Correo> correos) {
		ArrayList<Correo> nuevosCorreos = correos;
		for (Correo correoActual : nuevosCorreos) {
			inbox.agregarNuevoCorreo(correoActual);
		}
	}

}
