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
	
	public Integer CostoDelCultivo() {
		return this.getCostoPorAño();
	}

}
