package pre2;

import java.util.Scanner;

public class rideController {
	
	private static int bCost;
	private static int tCost;
	public static boolean busisFirstExecution2 = true;
	public static int balance;
	public static boolean taxiisFirstExecution2 = true;
	
	public static void busGo(busTest2 bt2) {
		bt2.busStart(bt2);
	}
	
	public static void takeBus(busTest2 bt) {
		bt.getBusPassenger();
	}
	
	public static void taxiGo(taxiTest2 tt2) {
		tt2.taxiStart(tt2);
	}
	
	public static void takeTaxi(taxiTest2 tt) {
		tt.getTaxiPassenger();
	}
	
	public static int busgetBalance() {	// 잔액
		if(busisFirstExecution2 || taxiTest2.taxiisFirstExecution2 == false) {	// 한번만 실행
			balance = getMONEY() - bCost;	// 버스가 처음 계산했을 경우 -> 10000 - 버스요금
			busisFirstExecution2 = false;	// 다시 시작하면 true로 초기화
		}	balance -= bCost;
		return stuTest2.getBalance();
	}

	public static int taxigetBalance() {	// 잔액
		if(taxiisFirstExecution2 || busTest2.busisFirstExecution2 == false) {	// 한번만 실행
			balance = getMONEY() - tCost;	// 택시가 처음 계산했을 경우
			taxiisFirstExecution2 = false;
		}	balance -= tCost;
		return stuTest2.getBalance();
	}
	private static int getMONEY() {
		return 10000;
	}
}
////////////// 다섯번째 클래스
