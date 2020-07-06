package ar.edu.unq.po2.StateYStrategy;

public class DesencriptadorPorVocales implements IStrategyDesencriptacion{

	@Override
	public String desencriptar(String texto) {
		texto = texto.replace("a", "e").replace("i","e").replace("o", "i")
				 .replace("u", "o").replace("u", "a");
	return texto;
	}

}
