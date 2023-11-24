package pre2;

import java.util.Scanner;

public class TransView {

	public static void studentChoice(String choice) {
		stuTest2 st2 =  new stuTest2(0);
		st2.stuInfo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("뭐 탈래 ?");
		
		choice = sc.nextLine();	
		if("버스".equals(choice)) {
			System.out.println("버스 메소드 시작");
			busTest2 bt2 =  new busTest2();
			rideController.busGo(bt2);
			choice = null;
		}
		else if("택시".equals(choice)) {
			System.out.println("택시 메소드 시작");
			taxiTest2 tt2 = new taxiTest2();
			rideController.taxiGo(tt2);
			choice = null;
		}
		else { 
			// 예외처리 메소드 시작
			System.out.println("예외처리 메소드 시작");
		}
		//System.out.println(choice);	// 값이 비었는지 확인
	}
}
/////////////////// 네번째 클래스