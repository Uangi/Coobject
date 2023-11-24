package pre3;

import java.util.Scanner;

public class TransView {

	public void studentChoice(String choice) {
		Scanner sc = new Scanner(System.in);
		System.out.println("뭐 탈래 ?");
		choice = sc.nextLine();	
		if("버스".equals(choice)) {
			
			System.out.println("버스 메소드 시작");
			busTest3 bt2 =  new busTest3();
			bt2.busStart();
			choice = null;
		}
		else if("택시".equals(choice)) {
			
			System.out.println("택시 메소드 시작");
			taxiTest3 tt2 = new taxiTest3();
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
/////////////////// 네번째 클래스