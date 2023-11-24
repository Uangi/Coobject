package Function;

import java.util.Scanner;

public abstract class preTaxi implements shareMoney {

	private int taxiIncome;
	private int taxiCost;
	
	
	public void getBalance(int MONEY) {
		MONEY = MONEY - taxiCost;
	}
	
	public int gettaxiCost(int taxiCost) {	
		Scanner sc = new Scanner(System.in);
		System.out.print("요금을 입력해주세요 : ");
		this.taxiCost = sc.nextInt();
		return this.taxiCost;
	}
}
