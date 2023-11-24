package pre2;

import java.util.Scanner;

public class mainRun {	// 다 합치기

	
	private static final String choice = null;

	public static void run() {
		
		
		TransView tv = new TransView();
		TransView.studentChoice(choice);
		
		while(choice == null){
			TransView.studentChoice(choice);
			Scanner sc = new Scanner(System.in);
			System.out.print("계속하시겠습니까? (Y/N) ");
	        String input = sc.next();
	        if (!input.equalsIgnoreCase("Y")) {
	            break;
	        }
		}
	}
	
}
/////////////다섯번째 클래스
