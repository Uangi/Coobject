package Function;

import java.util.List;
import java.util.Vector;

public class practiceVector {

	public void vecvec(stuTest st) {
		List<stuTest> list = new Vector<stuTest>();
		
		for(int i = 0; i < 3; i++) {
		list.add(new stuTest());
		}
		
		for(int i = 0; i < list.size(); i++) {
			stuTest st1 = list.get(i);
			System.out.println(st1.name + "\t" + st1.grade + "  "+ st1.MONEY + "\t");
		}
	}

}
