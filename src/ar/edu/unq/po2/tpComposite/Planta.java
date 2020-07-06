package ar.edu.unq.po2.tpComposite;


public abstract class Planta extends Cultivo{
	
	private Integer costoPorAño;

	public Planta(Integer costoPorAño) {
		super();
		this.costoPorAño = costoPorAño;
	}

	public void setCostoPorAño(Integer costoPorAño) {
		this.costoPorAño = costoPorAño;
	}

	public Integer getCostoPorAño() {
		return costoPorAño;
	}
	
	public int costoDeEsteCultivo() {
		return this.getCostoPorAño();
	}
	
	public int CostoDelCultivo() {
		return this.getCostoPorAño();
	}

}
