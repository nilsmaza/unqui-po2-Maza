package ar.edu.unq.po2.StateYStrategy;

public class EncriptadorPorVocales implements IStrategyEncriptacion{

	@Override
	public String encriptar(String texto) {
		String textoEnMinuscula = texto.toLowerCase(); //minuscula
		textoEnMinuscula = textoEnMinuscula.replace("u", "a").replace("o","u").replace("i", "o")
					 .replace("e", "i").replace("a", "e");
		return textoEnMinuscula;
	}

}
