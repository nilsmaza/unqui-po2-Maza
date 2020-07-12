package ar.edu.unq.po2.StateYStrategy2;

public class dosJugadores implements IJugador {


	@Override
	public String iniciarJuego(VideoJuego juego) {
		juego.setFichas(juego.getFichas() - 2);
		return "Cooperativo";
	}

}
