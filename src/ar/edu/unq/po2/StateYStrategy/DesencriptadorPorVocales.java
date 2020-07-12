package ar.edu.unq.po2.StateYStrategy;

public class DesencriptadorPorVocales implements IStrategyDesencriptacion{

	@Override
	public String desencriptar(String texto) {
		String textoEnMinuscula = texto.toLowerCase(); //minuscula
		textoEnMinuscula = textoEnMinuscula.replace("e", "a").replace("i","e").replace("o", "i")
				 .replace("u", "o").replace("u", "a");
	return textoEnMinuscula;
	}

}
