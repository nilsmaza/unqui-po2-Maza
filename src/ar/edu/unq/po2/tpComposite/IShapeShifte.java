package ar.edu.unq.po2.tpComposite;

import java.util.ArrayList;

public interface IShapeShifte {
	
		public IShapeShifte compose(IShapeShifte shape);
		public int deepest(); 
		public IShapeShifte flat();
		public ArrayList<Integer> values();

}
