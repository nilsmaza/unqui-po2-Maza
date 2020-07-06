package ar.edu.unq.po2.tpComposite;

import java.util.ArrayList;

public class CultivoMultiple extends Cultivo{
	
	private ArrayList<Cultivo> plantas = new ArrayList<Cultivo>();
	private int zonaDeCultivosDisponibles = 4;
	
	public CultivoMultiple() {
		super();
	}
	
	public int getZonaDeCultivosDisponibles() {
		return zonaDeCultivosDisponibles;
	}
	public ArrayList<Cultivo> getPlantas() {
		return plantas;
	}
	public void setZonaDeCultivosDisponibles(int zonaDeCultivosDisponibles) {
		this.zonaDeCultivosDisponibles = zonaDeCultivosDisponibles;
	}

	public void cultivarPlanta(Cultivo cultivo) {
		if(this.getZonaDeCultivosDisponibles() > 0) {
			this.plantas.add(cultivo);
			this.setZonaDeCultivosDisponibles(this.getZonaDeCultivosDisponibles()-1);
		}
	}
	
	public int costoDeEsteCultivo() {
		int costo = 0;
		for(Cultivo unaPlanta : this.getPlantas()) {
			costo += unaPlanta.CostoDelCultivo() / 4;
		}
	return costo;
	}
	
	@Override
	public int CostoDelCultivo() {
		int costo = 0;
			for(Cultivo unaPlanta : this.getPlantas()) {
				costo += unaPlanta.costoDeEsteCultivo();
			}
		return costo;
	}
	
	
	

}
