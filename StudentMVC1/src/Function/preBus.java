package Function;

import java.util.Scanner;

public abstract class preBus implements shareMoney {
	
	private final int busCost = 700;
	private int busIncome;
	private int busBalance;
	
	
	public void getBalance(int MONEY) {
		MONEY = MONEY - busCost;	// 현재 잔액
	}
	
	public int getbCost(int busCost) {	
		return this.busCost;
	}
}
