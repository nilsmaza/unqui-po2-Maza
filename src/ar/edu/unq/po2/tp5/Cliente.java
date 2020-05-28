package ar.edu.unq.po2.tp5;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private double sueldoNetoMensual;
	private PropiedadInmobiliaria propiedad;
	private double creditos;
	private SolicitudDeCredito solicitud;

	public Cliente
		(String nombre, String apellido, String direccion, Integer edad,
				double sueldoNetoMensual,PropiedadInmobiliaria propiedad,double creditos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.propiedad = propiedad;
		this.creditos = creditos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public double sueldoNetoAnual() {
		return this.getSueldoNetoMensual() * 12 ;
	}
	
	public double porcentajeDeSueldoMensual(Integer numero) {
		return this.getSueldoNetoMensual() / 100 * numero;
	}
	
	public double getCreditos() {
		return creditos;
	}

	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}

	public PropiedadInmobiliaria getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(PropiedadInmobiliaria propiedad) {
		this.propiedad = propiedad;
	}

	public SolicitudDeCredito getSolicitud() {
		return solicitud;
	}

	public void crearSolicitudDeCredito(SolicitudDeCredito solicitud) {
		this.solicitud = solicitud;
	}
	
}
