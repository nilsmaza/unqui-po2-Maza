package ar.edu.unq.po2.tp6;

import java.util.ArrayList;


public class AlmacenamientoDeCorreos {
	
	private ArrayList<Correo> listaDeCorreos = new ArrayList<Correo>();
	
	public AlmacenamientoDeCorreos() {
		super();
	}

	public void borrar(Correo correo) {
		listaDeCorreos.remove(correo);
	}
	
	public int cantidadDeCorreos() {
		return listaDeCorreos.size();
	}
	
	public void agregarNuevoCorreo(Correo nuevoCorreo) {
		listaDeCorreos.add(nuevoCorreo);
	}

/*	public List<Correo> recibirNuevos(String user, String pass);
	
	public void enviar(Correo correo);

	public float tazaDeTransferencia();
	
	public void realizarBackUp();
*/
}
