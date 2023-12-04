package Abstract;

import java.util.Scanner;

interface AccountService {
	int deposit();
//	void buyToy();
	void setBalance(int newBalance);
	int getBalance();
}

class Account implements AccountService {
	
	public int amount;	// 입금액?
	public int balance;	// 잔액
	Input ip = new Input();
	
	@Override
	public int deposit() {	
	amount = ip.howmuchDeposit();	// static을 쓰거나 객체 생성하거나
	balance += amount;
	System.out.println("입금 : " + amount);	// 표시
	return balance;
	}
	@Override
	public int getBalance() {
		return balance;
	}
	
	@Override
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}