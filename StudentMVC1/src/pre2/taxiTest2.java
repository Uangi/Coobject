package pre2;

import java.util.Scanner;

public class taxiTest2 {

	private int tCost;
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
		Scanner sc = new Scanner(System.in);
		System.out.print("요금을 입력해주세요 : ");
		this.tCost = sc.nextInt();
		return this.tCost;
	}
	
	public int gettCost() {
		return tCost;
	}

	public int getTaxiPassenger() {
		return taxiPassenger;
	}

	public int getIncome() {
		return income;
	}

	public int getFirstmoney() {
		return firstmoney;
	}

	public int getResultmoney() {
		return resultmoney;
	}
	
	public void updateResultmoeny() {
		
	}
	public void take() {	// 승객 수 증가
		taxiPassenger++;
	}
	
	public void taxiInfo(taxiTest2 tt) {
		System.out.println("택시요금 : " + tt.getbCost(this.tCost) + ", 택시승객 수 : " + tt.getTaxiPassenger() + " 명 "
		+ ", 수입은 : " + tt.getIncome() + "원, 현재 잔액은 : " + 
		tt.getResultmoney() + "원, 탑승 후 잔액: " + getFirstmoney() + "원\n");
	}
	
	public void taxiStart() {
		
	}

}