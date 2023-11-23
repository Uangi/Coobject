package pre2;

import java.util.Scanner;

public class TransView {

	public void studentChoice(String choice) {
		System.out.println("뭐 탈래 ?");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextLine();	
		if("버스".equals(choice)) {
			
			System.out.println("버스 메소드 시작");
			busTest2 bt2 =  new busTest2();
			bt2.busStart();
			choice = null;
		}
		else if("택시".equals(choice)) {
			
			System.out.println("택시 메소드 시작");
			taxiTest2 tt2 = new taxiTest2();
			tt2.taxiStart();
			choice = null;
		}
		else { 
			// 예외처리 메소드 시작
			System.out.println("예외처리 메소드 시작");
		}
		//System.out.println(choice);	// 값이 비었는지 확인
	}
}
