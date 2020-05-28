package ar.edu.unq.po2.tpComposite;

import java.util.ArrayList;

public class CultivoMultiple extends Cultivo{
	
	private ArrayList<Cultivo> plantas ;
	private Integer zonaDeCultivosDisponibles;
	
	public CultivoMultiple(ArrayList<Cultivo> plantas, Integer zonaDeCultivosDisponibles) {
		super();
		this.plantas = new ArrayList<Cultivo>();
		this.zonaDeCultivosDisponibles = 4;
	}
	
	public Integer getZonaDeCultivosDisponibles() {
		return zonaDeCultivosDisponibles;
	}
	public ArrayList<Cultivo> getPlantas() {
		return plantas;
	}

	public void setZonaDeCultivosDisponibles(Integer zonaDeCultivosDisponibles) {
		this.zonaDeCultivosDisponibles = zonaDeCultivosDisponibles;
	}

	public void cultivarPlanta(Cultivo cultivo) {
		if(this.getZonaDeCultivosDisponibles() > 0) {
			this.plantas.add(cultivo);
			this.setZonaDeCultivosDisponibles(this.getZonaDeCultivosDisponibles()-1);
		}
	}
	
	@Override
	public Integer CostoDelCultivo() {
		Integer costo = 0;
			for(Cultivo unaPlanta : this.getPlantas()) {
				costo += unaPlanta.CostoDelCultivo() / 4;
			}
		return costo;
	}
	

}
