package ar.edu.unq.po2.StateYStrategy;

public class EncriptadorPorVocales implements IStrategyEncriptacion{

	@Override
	public String encriptar(String texto) {
		texto = texto.replace("u", "a").replace("o","u").replace("i", "o")
					 .replace("i", "e").replace("a", "e");
		return texto;
	}

}
