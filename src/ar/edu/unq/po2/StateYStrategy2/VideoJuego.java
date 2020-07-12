package ar.edu.unq.po2.StateYStrategy2;

public class VideoJuego {

	private int fichas = 0;
	private IJugador jugadorActual;
	
	
	
	public VideoJuego() {
		super();
		this.jugadorActual = new pantallaDeInicio();
	}

	public int getFichas() {
		return fichas;
	}

	public void setFichas(int fichas) {
		this.fichas = fichas;
	}
	
	public void setjugadorActual(IJugador jugador) {
		this.jugadorActual = jugador;
	}
	
	public void agregarFicha() {
		this.fichas++;
			if(this.getFichas() >= 2) {
				this.setjugadorActual(new dosJugadores());
			}else {if(this.getFichas()  < 2) {
				this.setjugadorActual(new unJugador());
					}
			}
	}
	
	public String iniciarJuego(){
		return this.jugadorActual.iniciarJuego(this);
	}


	
}
