package pre2;

import java.util.Scanner;

public class taxiTest2 {

	private static final int tCost = 300;
	private static int taxiPassenger;
	private static int income;
	private static int balance;
	
	private static boolean taxiisFirstExecution = true;
	public static boolean taxiisFirstExecution2 = true;
	
	public taxiTest2() {
		taxiTest2.income = getIncome();
		this.taxiPassenger = taxiPassenger;
	}

	public int gettCost(int tCost) {	// 요금
		return tCost;
	}

	public int getTaxiPassenger() {
		if(taxiisFirstExecution) {	// 한번만 실행	왜 2부터 카운터되서 -- 쓰게 만드는가
			taxiPassenger--;
			taxiisFirstExecution = false;
			}
		taxiPassenger++;
		return taxiPassenger;
	}

	public int getIncome() {		// 수입
		income += tCost;
		return income;
	}
	
	public static int getBalance() {	// 잔액
		if(taxiisFirstExecution2 || busTest2.busisFirstExecution2 == false) {	// 한번만 실행
			balance = getMONEY() - tCost;
			taxiisFirstExecution2 = false;
		}	balance -= tCost;
		return balance;
	}
	
	private static int getMONEY() {
		return 10000;
	}
	public void taxiInfo(taxiTest2 tt) {
		System.out.println("택시요금 : " + tt.gettCost(this.tCost) + "원, 택시승객 수 : " + tt.getTaxiPassenger() + " 명 "
		+ ", 택시수입은 : " + tt.getIncome() + "원, 현재 잔액은 : " + 
		tt.getBalance() + "원\n");
	}
	
	public void taxiStart(taxiTest2 tt2) {
		rideController.takeTaxi(tt2);
		tt2.taxiInfo(tt2);
		tt2.taxiInfo(tt2);
	}
}