package ar.edu.unq.po2.tpObserver2;

public interface IObserver {
	
	public boolean interesadoEn(Partido partido);
	
	public void update(Partido partido);
	
}
