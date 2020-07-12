package ar.edu.unq.po2.StateYStrategy;

public class EncriptadoNumerico implements IStrategyEncriptacion {
	
	private String abc = "abcdefghijklmnñopqrstuvwxyz";	// 27 letras
	
	public EncriptadoNumerico() {
		super();
	}

	public String encriptar(String texto) {
		String textoEnMinuscula = texto.toLowerCase(); //minuscula
		String textoEncriptado = "";
		for (int i = 0; i < textoEnMinuscula.length(); i++) {
			String letraEncriptada = reemplazar(textoEnMinuscula.charAt(i)); //charAt(i) devuelve el carácter en el índice especificado en una cadena
			if (i != 0) {
				textoEncriptado = textoEncriptado + ",";
			}			
			textoEncriptado = textoEncriptado + letraEncriptada;
		}
		return textoEncriptado;
	}
	
	private String reemplazar(char letra) {
		Integer valorLetra = abc.indexOf(letra);
		return valorLetra.toString();
	}
	
}
