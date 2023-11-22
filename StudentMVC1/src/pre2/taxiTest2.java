package pre2;

import java.util.Scanner;

public class taxiTest2 {

	private final int tCost = 300;
	private int taxiPassenger;
	private int income;
	private int firstmoney;
	private int resultmoney;
	private boolean isFirstExecution = true;
	
	public taxiTest2() {
		this.taxiPassenger = getTaxiPassenger();  // = 0;
		this.income = getIncome(); // = 0
		this.firstmoney = getFirstmoney();
		this.resultmoney = getResultmoney();
	}

	public int getbCost(int tCost) {
		System.out.print("택시 요금은 : " + tCost + "원 입니다.");
		return this.tCost;
	}
	
	public int gettCost() {
		return tCost;
	}

	public int getTaxiPassenger() {
		return taxiPassenger;
	}

	public int getIncome() {
		if(isFirstExecution) {
		income = 0;
		income += tCost;
		isFirstExecution = false;
		}
		return income;
	}

	public int getFirstmoney() {
		updateResultmoney();
		return firstmoney;
	}
	
	public int getResultmoney() {	// 현재 잔액
		resultmoney = firstmoney;
		return resultmoney;
	}
	
	public void updateResultmoney() {
		if(isFirstExecution) {	// 한번만 실행
			firstmoney = 10000;
			isFirstExecution = false;
		}
		firstmoney = firstmoney - tCost; // 첫 계산 후 초기 잔액값
	}
	public void Ttake() {	// 승객 수 증가
		taxiPassenger++;
	}
	
	public void taxiInfo(taxiTest2 tt) {
		System.out.println("택시요금 : " + tt.getbCost(tCost) + "원, 택시승객 수 : " + tt.getTaxiPassenger() + " 명 "
		+ ", 택시수입은 : " + tt.getIncome() + "원, 현재 잔액은 : " + 
		tt.getResultmoney() + "원, 탑승 후 잔액: " + getFirstmoney() + "원\n");
	}
	
	public void taxiStart() {
		int ch = 0;
		TransView tv = new TransView();
		stuTest2 st2 =  new stuTest2(0);
		taxiTest2 tt2 =  new taxiTest2();
		do {
			taxiTest2 t2_2 =  new taxiTest2();
		st2.takeTaxi(tt2);
		tt2.taxiInfo(tt2);
		ch++;
		} while(ch < 2);
	}

}
