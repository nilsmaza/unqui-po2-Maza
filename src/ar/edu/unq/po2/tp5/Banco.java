package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudDeCredito> solicitudes;
	
	public Banco() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	}

	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}

	public ArrayList<SolicitudDeCredito> getSolicitudes() {
		return this.solicitudes;
	}
	
	public void agregarCliente(Cliente nuevoCliente) {
		this.clientes.add(nuevoCliente);
	}
	
	public void agregarSolicitud(SolicitudDeCredito solicitud) {
		this.solicitudes.add(solicitud);
	}
	
	
	
	public double montoTotalADesembolsar() {
		double totalADesembolsar = 0;
			for(SolicitudDeCredito solicitud : this.getSolicitudes()) {
				if(solicitud.chequeoDeAceptacion()) {
					totalADesembolsar += solicitud.getMontoSolicitado();
				}
			}
		return totalADesembolsar; 
	}
	
}
