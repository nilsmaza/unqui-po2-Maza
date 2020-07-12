package ar.edu.unq.po2.tp7;

public class MismaLetraInicial extends Filtro{
	
	public MismaLetraInicial(){
	}

	@Override
	public boolean esSimilar(WikipediaPage pagina1, WikipediaPage pagina2) {
		boolean esIgual = false;	
		String tituloDeLaPagina1 = pagina1.getTitle();
		String tituloDeLaPagina2 = pagina2.getTitle();	
			if(tituloDeLaPagina1.charAt(0) == tituloDeLaPagina2.charAt(0)) {
				esIgual= true;
			}
		return esIgual;
	}
}
