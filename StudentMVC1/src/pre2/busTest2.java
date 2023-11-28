package pre2;

import java.util.Scanner;

public class busTest2 {
	
	private static int bCost;
	private static int busPassenger;
	private static int income;
	private static int firstmoney;
	private static int balance;
	
	private static boolean busisFirstExecution = true;
	public static boolean busisFirstExecution2 = true;

	public busTest2() {	// 수입의 메소드
		this.income = getIncome(); // = 0
		this.firstmoney = firstmoney;
		this.busPassenger = busPassenger;
	}
	
	public int getbCost(int bCost) {	
		Scanner sc = new Scanner(System.in);
		System.out.print("요금을 입력해주세요 : ");
		this.bCost = sc.nextInt();
		return this.bCost;
	}

	public int getBusPassenger() {	// 승객 수
		if(busisFirstExecution) {	// * 한번만 실행	왜 2부터 카운터되서 -- 쓰게 만드는가
			busPassenger--;
			busisFirstExecution = false;
			}
		busPassenger++;
		return busPassenger;
	}

	public int getIncome() {	// 수입
		income += bCost;
		return income;
	}
	
	public static int getBalance() {	// 잔액
		if(busisFirstExecution2 || taxiTest2.taxiisFirstExecution2 == false) {	// 한번만 실행
			balance = getMONEY();
			busisFirstExecution2 = false;
		}	balance -= bCost;
		return balance;
	}

	private static int getMONEY() {
		return 10000;
	}

	public void busInfo(busTest2 tb) {
		System.out.println("버스요금 : " + tb.getbCost(this.bCost) + "원 , 버스승객 수 : " + tb.getBusPassenger() + " 명 "
		+ ", 버스수입은 : " + tb.getIncome() + "원, 현재 잔액은 : " + 
		busTest2.getBalance() + "원\n");
	}
	
	public void busStart(busTest2 bt2) {
		rideController.takeBus(bt2);
			bt2.busInfo(bt2);	// bt2 버스의 객체
			bt2.busInfo(bt2);
	}
}
		
//////////////	두번째 클래스