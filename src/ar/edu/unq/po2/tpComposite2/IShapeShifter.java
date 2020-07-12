package ar.edu.unq.po2.tpComposite2;

import java.util.ArrayList;

public interface IShapeShifter {
	
		public IShapeShifter compose(IShapeShifter shape);
		public int deepest(); 
		public IShapeShifter flat();
		public ArrayList<Integer> values();

}
