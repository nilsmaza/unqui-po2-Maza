package ar.edu.unq.po2.StateYStrategy;

public class EncriptadorNaive {

	private IStrategyEncriptacion encriptacion;
	private IStrategyDesencriptacion desencriptacion;
	
	
	public EncriptadorNaive(IStrategyEncriptacion encriptacion, IStrategyDesencriptacion desencriptacion) {
		super();
		this.encriptacion = encriptacion;
		this.desencriptacion = desencriptacion;
	}

	public void setEncriptacion(IStrategyEncriptacion encriptacion) {
		this.encriptacion = encriptacion;
	}
	
	public void setDesencriptacion(IStrategyDesencriptacion desencriptacion) {
		this.desencriptacion = desencriptacion;
	}

	public String encriptar(String texto) {
		return encriptacion.encriptar(texto);
	}
	
	public String desencriptar(String texto) {
		return desencriptacion.desencriptar(texto);
	}
	
}
