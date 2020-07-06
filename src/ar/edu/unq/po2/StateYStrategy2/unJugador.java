package ar.edu.unq.po2.StateYStrategy2;

public class unJugador implements IJugador {

	@Override
	public String iniciarJuego(VideoJuego juego) {
		juego.setFichas(juego.getFichas() - 1);
		return "modo Historia";
	}

}
