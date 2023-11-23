package pre2;

import java.util.Scanner;

public class taxiTest2 {

	private final int tCost = 300;
	private int taxiPassenger;
	private int income;
	private int firstmoney;
	private int resultmoney;
	private boolean isFirstExecution2 = true;
	private boolean isFirstExecution3 = true;
	
	public taxiTest2() {
		this.taxiPassenger = getTaxiPassenger();  // = 0;
		this.income = getIncome(); // = 0
		//this.firstmoney = getFirstmoney();
		this.resultmoney = getResultmoney();
	}

	public int gettCost(int tCost) {
		return tCost;
	}

	public int getTaxiPassenger() {
		return taxiPassenger;
	}

	public int getIncome() {
		if(isFirstExecution2) {
		income -= tCost;
		isFirstExecution2 = false;
		}
		income += tCost;
		return income;
	}

	
	public int getResultmoney() {	// 현재 잔액
		if(isFirstExecution2) {
			resultmoney = 10000;
			isFirstExecution2 = false;
			}
		resultmoney = firstmoney;
		return resultmoney;
	}
	
	public int updateResultmoney() {
		if(isFirstExecution3) {	// 한번만 실행
			firstmoney = 10000;
			isFirstExecution3 = false;
		}
		firstmoney = firstmoney - tCost; // 첫 계산 후 초기 잔액값
		return firstmoney;
	}
	
	public void Ttake() {	// 승객 수 증가
		taxiPassenger++;
	}
	
	public void taxiInfo(taxiTest2 tt) {
		System.out.println("택시요금 : " + tt.gettCost(tCost) + "원, 택시승객 수 : " + tt.getTaxiPassenger() + " 명 "
		+ ", 택시수입은 : " + tt.getIncome() + "원, 현재 잔액은 : " + 
		tt.getResultmoney() + "원, 탑승 후 잔액: " + updateResultmoney() + "원\n");
	}
	
	public void taxiStart() {
		int ch = 0;
		TransView tv = new TransView();
		stuTest2 st2 =  new stuTest2(0);
		taxiTest2 tt2 =  new taxiTest2();
		do {
		st2.takeTaxi(tt2);
		tt2.taxiInfo(tt2);
		ch++;
		} while(ch < 4);
		st2.takeTaxi(tt2);
		tt2.taxiInfo(tt2);
	}

}
