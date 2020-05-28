package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IServidor {
	
	private ArrayList<ClienteEMail> clientes;
	private ArrayList<Correo> correos ;
	
	public ArrayList<Correo> getCorreos() {
		return correos;
	}

	public void setCorreos(ArrayList<Correo> correos) {
		this.correos = correos;
	}

	public ArrayList<ClienteEMail> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<ClienteEMail> clientes) {
		this.clientes = clientes;
	}

	public List<Correo> recibirNuevos(String user, String pass) {
		List<Correo> retorno = new ArrayList<Correo>();
		  //Verificar autenticidad de usuario.
		//obtener emails Nuevos del usuario.
		//asignar a retorno la lista de los nuevos e-mails
			if(this.verificarUsuario(user, pass)) {
				for(Correo nuevoCorreo : this.getCorreos()) {
					if(user == nuevoCorreo.getDestinatario()) {
						retorno.add(nuevoCorreo);
					}
			}
		}
		return retorno;
	}

	public void conectar(String nombreUsuario, String passusuario) {
	//	if(this.verificarUsuario(user, pass)) {
			
	//	}
	   //Verifica que el usuario sea valido y establece la conexion.
		
	}

	public void enviar(Correo correo) {
		this.getCorreos().add(correo);
      //realiza lo necesario para enviar el correo.		
	}

	@Override
	public float tazaDeTransferencia() {
		//no corresponde
		return 0;
	}

	@Override
	public void resetear() {
         //no corresponde		
	}

	@Override
	public void realizarBackUp() {
		//no corresponde
		
	}
	
	public boolean verificarUsuario(String user,String pass) {
		boolean verdad = false;
		for(ClienteEMail cliente : this.getClientes() ) {
			if(cliente.getNombreUsuario() == user && cliente.getPassusuario() == pass) {
				verdad = true;
			}
		}
		return verdad;
	}
	

}