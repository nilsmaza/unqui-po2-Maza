package ar.edu.unq.po2.StateYStrategy;

public class DesencriptadorPorNumero implements IStrategyDesencriptacion{

	private String abc = "abcdefghijklmnñopqrstuvwxyz";
	
	@Override
	public String desencriptar(String texto) {
		String[] letras = texto.split(","); // DEVUELVE una nueva array
		String nuevoTexto = "";
		for (int i = 0; i < letras.length; i++) {
			char letra = recuperar(letras[i]);
			nuevoTexto = nuevoTexto + letra;
		}
		return nuevoTexto;
	}
	
	private char recuperar(String valorLetra) {
		Integer posicionDeLaLetra = Integer.valueOf(valorLetra);
		return abc.charAt(posicionDeLaLetra);
	}

}
