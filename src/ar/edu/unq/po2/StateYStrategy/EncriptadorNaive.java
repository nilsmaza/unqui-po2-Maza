package ar.edu.unq.po2.StateYStrategy;

public class EncriptadorNaive {

	private IStrategyEncriptacion encriptacion;
	private IStrategyDesencriptacion desencriptacion;
	
	public void setEncriptacion(IStrategyEncriptacion encriptacion) {
		this.encriptacion = encriptacion;
	}
	
	public void setDesencriptacion(IStrategyDesencriptacion desencriptacion) {
		this.desencriptacion = desencriptacion;
	}

	public String encriptar(String cadena) {
		return encriptacion.encriptar(cadena);
	}
	
	public String desencriptar(String cadena) {
		return desencriptacion.desencriptar(cadena);
	}
	
}
