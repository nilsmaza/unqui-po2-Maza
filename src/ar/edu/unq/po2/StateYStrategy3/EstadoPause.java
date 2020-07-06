package ar.edu.unq.po2.StateYStrategy3;

public class EstadoPause implements IEstadoDelReproductor {

	@Override
	public void play(ReproductorMP3 reproductor) throws Exception {
		throw new Exception("Cancion Pausada");

	}

	@Override
	public void pause(ReproductorMP3 reproductor){  //ReproductorMP3 vuelve al estadoPlay
		reproductor.getCancionAReproducir().pause();
		reproductor.setEstado(new EstadoPlay());
	}

	@Override
	public void stop(ReproductorMP3 reproductor) {
		reproductor.getCancionAReproducir().stop();
		reproductor.setEstado(new EstadoStop());
		reproductor.setCancionAReproducir(null);
	}

}
