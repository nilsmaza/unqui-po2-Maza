package ar.edu.unq.po2.StateYStrategy;

import java.util.HashMap;
import java.util.Map;

public class EncriptadoNumerico implements IStrategyEncriptacion {
	
	private Map<String,String> abcNumerico;
	
	public void numerosARemplazar(){
		this.abcNumerico = new HashMap<String,String>();
			abcNumerico.put(" ", "0"); abcNumerico.put("a", "1");
			abcNumerico.put("b", "2"); abcNumerico.put("c", "3");
			abcNumerico.put("d", "4"); abcNumerico.put("e", "5");
			abcNumerico.put("f", "6"); abcNumerico.put("g", "7");
			abcNumerico.put("h", "8"); abcNumerico.put("i", "9");
			abcNumerico.put("j", "10"); abcNumerico.put("k", "11");
			abcNumerico.put("l", "12"); abcNumerico.put("m", "13");
			abcNumerico.put("n", "14"); abcNumerico.put("ñ", "15");
			abcNumerico.put("o", "16"); abcNumerico.put("p", "17");
			abcNumerico.put("q", "18"); abcNumerico.put("r", "19");
			abcNumerico.put("s", "20"); abcNumerico.put("t", "21");
			abcNumerico.put("u", "22"); abcNumerico.put("v", "23");
			abcNumerico.put("w", "24"); abcNumerico.put("x", "25");
			abcNumerico.put("y", "26"); abcNumerico.put("z", "27");
	}

	@Override
	public String encriptar(String texto) {
		char [] textoList = texto.toCharArray();
		String textoEncriptado = "";
			for(char letra : textoList) {
				textoEncriptado = this.abcNumerico.get(Character.toString(letra).toLowerCase()) + "," ;
			}
		return textoEncriptado.substring(0, textoEncriptado.length() - 1);
	}

}
