package ar.edu.unq.po2.tp7;

import java.util.Map;
import java.util.Set;

public class PropiedadEnComun extends Filtro{
	
	public PropiedadEnComun() {
	}

	@Override
	public boolean esSimilar(WikipediaPage pagina1, WikipediaPage pagina2) {
		boolean esIgual = false;
		Map<String, WikipediaPage> infobox = pagina1.getInfobox();
		Set<String> propiedadesInfobox = infobox.keySet();
		Map<String, WikipediaPage> infoboxOtraPagina = pagina2.getInfobox();
			for (String propiedad : propiedadesInfobox) {
				if(infoboxOtraPagina.containsKey(propiedad)) {
					esIgual = true;
				}
			}
		return esIgual;
	}

}
