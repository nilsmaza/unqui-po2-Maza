package ar.edu.unq.po2.tp7;

import java.util.ArrayList;

public class LinkEnComun extends Filtro{
	
	public LinkEnComun(){
	}

	@Override
	public boolean esSimilar(WikipediaPage pagina1, WikipediaPage pagina2) {
		boolean esIgual = false;	
		ArrayList<WikipediaPage> linksPagina1 = pagina1.getLinks();
		ArrayList<WikipediaPage> linksPagina2 = pagina2.getLinks();	
			for (WikipediaPage link : linksPagina1) {
				if(linksPagina2.contains(link)) {
					esIgual= true;
				}
			}
		return esIgual;
	}

}
