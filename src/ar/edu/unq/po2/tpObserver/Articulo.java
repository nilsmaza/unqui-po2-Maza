package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;

public class Articulo {
	
	private String titulo;
	private String autor;
	private String filiaciones;
	private String tipoDeArticulo;
	private String lugarDePublicacion;
	private String palabraClave;
	
	public Articulo(String titulo, String autor, String filiaciones, String tipoDeArticulo, String lugarDePublicacion,
			String palabraClave) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.filiaciones = filiaciones;
		this.tipoDeArticulo = tipoDeArticulo;
		this.lugarDePublicacion = lugarDePublicacion;
		this.palabraClave = palabraClave;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getFiliaciones() {
		return filiaciones;
	}

	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	public String getPalabraClave() {
		return palabraClave;
	}
	
	public ArrayList<String> getListadoDeDatos(){
		ArrayList<String> nuevaLista = new ArrayList<String>();
			nuevaLista.add(getAutor());
			nuevaLista.add(getTitulo());
			nuevaLista.add(getFiliaciones());
			nuevaLista.add(getTipoDeArticulo());
			nuevaLista.add(getLugarDePublicacion());
			nuevaLista.add(getPalabraClave());
		return nuevaLista;
	}

}
