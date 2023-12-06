package DuplicationDelete;

import java.util.Scanner;

public class Number {
		
	Scanner sc = new Scanner(System.in);
	View v = new View();
	
	public int numberRegist() {	
		v.numberInput();
		return sc.nextInt();
	}
	
}
