package ar.edu.unq.po2.StateYStrategy3;

public class EstadoPlay implements IEstadoDelReproductor {

	@Override
	public String estadoDelReproductor() {
		return "reproducionEnProceso";
	}

	@Override
	public void play(ReproductorMP3 reproductor) throws Exception { //throw new Excepcion
		throw new Exception("Reproduciendo cancion");

	}

	@Override
	public void pause(ReproductorMP3 reproductor) {  //reproductorMP3 en estadoPause
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
