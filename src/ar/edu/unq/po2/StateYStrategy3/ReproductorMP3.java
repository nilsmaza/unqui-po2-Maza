package ar.edu.unq.po2.StateYStrategy3;

public class ReproductorMP3 {

	private IEstadoDelReproductor estado;
	private Song cancionAReproducir;
	
	public ReproductorMP3(Song cancionAReproducir) {
		super();
		this.estado = new EstadoInical();
		this.cancionAReproducir = cancionAReproducir;
	}

	public IEstadoDelReproductor getEstado() {
		return estado;
	}

	public void setEstado(IEstadoDelReproductor estado) {
		this.estado = estado;
	}

	public Song getCancionAReproducir() {
		return cancionAReproducir;
	}

	public void setCancionAReproducir(Song cancionAReproducir) {
		this.cancionAReproducir = cancionAReproducir;
	}
	
	public void play() throws Exception {
		this.getEstado().play(this);
	}

	public void pause() throws Exception {
		this.getEstado().pause(this);
	}

	public void stop() {
		this.getEstado().stop(this);
	}
	
	
	
	
}
