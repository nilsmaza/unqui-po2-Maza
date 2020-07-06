package ar.edu.unq.po2.StateYStrategy3;

public interface IEstadoDelReproductor {
	
	public void play(ReproductorMP3 reproductor) throws Exception;
	
	public void pause(ReproductorMP3 reproductor) throws Exception;
	
	public void stop(ReproductorMP3 reproductor);

}
