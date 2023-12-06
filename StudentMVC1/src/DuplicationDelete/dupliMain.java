package DuplicationDelete;

import java.util.List;

public class dupliMain {

	public static void main(String[] args) {
		
	        DuplicationCheck dc = new DuplicationCheck();
	        List<Integer> selectedNumbers = dc.selectNumbers();
	        System.out.println("입력된 숫자: " + selectedNumbers);
	    }
	   }

