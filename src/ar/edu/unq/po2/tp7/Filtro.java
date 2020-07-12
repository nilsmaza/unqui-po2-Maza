package ar.edu.unq.po2.tp7;

import java.util.ArrayList;

public abstract class Filtro {
	
	public ArrayList<WikipediaPage> getSimilarPages(WikipediaPage pagina1, ArrayList<WikipediaPage> wikipedia) {
		ArrayList<WikipediaPage> paginasSimilares = new ArrayList<WikipediaPage>();	
			for (WikipediaPage PaginaActual : wikipedia) {
				if(esSimilar(pagina1, PaginaActual))
					paginasSimilares.add(PaginaActual );
			}
		return paginasSimilares;
	}

	
	public abstract boolean esSimilar(WikipediaPage pagina1, WikipediaPage pagina2);
	
}
