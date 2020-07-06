package ar.edu.unq.po2.StateYStrategy3;

public class EstadoStop implements IEstadoDelReproductor {

	@Override
	public void play(ReproductorMP3 reproductor) {
		reproductor.getCancionAReproducir().play();
		reproductor.setEstado(new EstadoPlay());
	}

	@Override
	public void pause(ReproductorMP3 reproductor) throws Exception {
		throw new Exception("No hay cancion reproduciendose");
	}

	@Override
	public void stop(ReproductorMP3 reproductor) { } // no hace nada por que no hay cancion reproduciendose o pausada

}
