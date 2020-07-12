package ar.edu.unq.po2.tpObserver2;

import java.util.ArrayList;

public class Deporte {
	
	private String tipoDeDeporte;
	private ArrayList<Partido> partidos = new ArrayList<Partido>();
	private ArrayList<ServidorObservable> servidores = new ArrayList<ServidorObservable>();

	public Deporte(String nombreDelDeporte) {
		this.setTipoDeDeporte(nombreDelDeporte);
	}

	public void agregarServidor(Servidor servidor) {
		this.servidores.add(servidor);
	}

	public void eliminarServidor(Servidor servidor) {
		this.servidores.remove(servidor);
	}
	
	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
		notificarServidores(partido);
	}

	private void notificarServidores(Partido partido) {
		for (ServidorObservable servidor : servidores) {
			servidor.updateServidores(partido);
		}
	}
	
	public String getTipoDeDeporte() {
		return tipoDeDeporte;
	}

	public void setTipoDeDeporte(String tipoDeDeporte) {
		this.tipoDeDeporte = tipoDeDeporte;
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(ArrayList<Partido> partidos) {
		this.partidos = partidos;
	}

	public ArrayList<ServidorObservable> getServidores() {
		return servidores;
	}

	public void setServidores(ArrayList<ServidorObservable> servidores) {
		this.servidores = servidores;
	}
	
}
