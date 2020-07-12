package ar.edu.unq.po2.StateYStrategy3;

public interface IEstadoDelReproductor {
	
	public String estadoDelReproductor(); // solo se usa en el test para ver si cambia de estado
	
	public void play(ReproductorMP3 reproductor) throws Exception;
	
	public void pause(ReproductorMP3 reproductor) throws Exception;
	
	public void stop(ReproductorMP3 reproductor);
	
	

}
