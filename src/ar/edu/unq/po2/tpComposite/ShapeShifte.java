package ar.edu.unq.po2.tpComposite;

import java.util.ArrayList;

public abstract class ShapeShifte implements IShapeShifte {

	public IShapeShifte compose(ShapeShifte shape) {
		ArrayList<ShapeShifte> listaDe = new ArrayList<ShapeShifte>() ;
		IShapeShifter nuevoShape;
			listaDe.add(this);
			listaDe.add(shape);
			nuevoShape = new IShapeShifter(listaDe);
		return nuevoShape;
	}
	
	public abstract Integer numero();
	public abstract int profundidad() ;
	public abstract ArrayList<ShapeShifte> desarmadoDeShape();

}
