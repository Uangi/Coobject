package pre3;

import java.util.Scanner;

import Function.shareMoney;

public class taxiTest3 implements shareMoney{

	private final int tCost = 300;
	private int taxiPassenger;
	private int income;
	private boolean TaxiisFirstExecution = true;
	
	
	public taxiTest3() {
		this.taxiPassenger = getTaxiPassenger();  // = 0;
		this.income = getIncome(); // = 0
		
	}

	public int gettCost(int tCost) {
		return tCost;
	}

	public int getTaxiPassenger() {
		return taxiPassenger;
	}	

	public int getIncome() {
		income += tCost;
		return income;
	}

	public int Ttake(stuTest3 st2) {	// 승객 수 증가
		st2.Balance -= tCost;
		taxiPassenger++;
		return st2.Balance;	// 원래 없었음
	}

	public int firstTaxi(stuTest3 st2) {
		if(TaxiisFirstExecution) {	// 택시가 제일 먼저 선택 된다면
			st2.Balance = st2.getMONEY() - tCost;
			TaxiisFirstExecution = false;
			}
		return st2.Balance;
	}
	
	public void taxiInfo(taxiTest3 tt, stuTest3 st2) {
		System.out.println("택시요금 : " + tt.gettCost(tCost) + "원, 택시승객 수 : " + tt.getTaxiPassenger() + " 명 "
		+ ", 택시수입은 : " + tt.getIncome() + "원, 현재 잔액은 : " + 
		 st2.Balance + "원, 탑승 후 잔액: "  + "원\n");
	}
	
	public void taxiStart() {
		int ch = 0;
		TransView tv = new TransView();
		stuTest3 st2 =  new stuTest3();
		taxiTest3 tt2 =  new taxiTest3();
		firstTaxi(st2);
		do {
		st2.takeTaxi(tt2);
		tt2.taxiInfo(tt2,st2);
		ch++;
		} while(ch < 3);
	}

	@Override
	public void busMoney() {
	}

	@Override
	public void taxiMoney() {
	}

	@Override
	public void getBalance() {
	}


}
///////////// 세번째 클래스