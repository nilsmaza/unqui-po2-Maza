package ar.edu.unq.po2.tpComposite;


public abstract class Planta extends Cultivo{
	
	private Integer costoPorA�o;

	public Planta(Integer costoPorA�o) {
		super();
		this.costoPorA�o = costoPorA�o;
	}

	public void setCostoPorA�o(Integer costoPorA�o) {
		this.costoPorA�o = costoPorA�o;
	}

	public Integer getCostoPorA�o() {
		return costoPorA�o;
	}
	
	public Integer CostoDelCultivo() {
		return this.getCostoPorA�o();
	}

}
