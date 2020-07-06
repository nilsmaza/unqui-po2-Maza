package ar.edu.unq.po2.StateYStrategy3;

public class EstadoInical implements IEstadoDelReproductor {

	@Override
	public void play(ReproductorMP3 reproductor) {
		reproductor.getCancionAReproducir().play();
		reproductor.setEstado(new EstadoPlay());
	}

	@Override
	public void pause(ReproductorMP3 reproductor) {
		reproductor.getCancionAReproducir().pause();
		reproductor.setEstado(new EstadoPause());
		
	}

	@Override
	public void stop(ReproductorMP3 reproductor) {
		reproductor.getCancionAReproducir().stop();
		reproductor.setEstado(new EstadoStop());
		reproductor.setCancionAReproducir(null);
	}

}
