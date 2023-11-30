package Abstract;

import java.util.Scanner;

interface AccountService {
	void deposit();
	void withdraw();
	int getBalance();
}

class Account implements AccountService {
	
	public int amount;
	public int balance;	// 잔액 , amount - 입출금액
	Scanner sc = new Scanner(System.in);
	Input ip = new Input();
	
	@Override
	public void deposit() {
	amount = ip.howmuchDeposit();	// static을 쓰거나 객체 생성하거나
	balance += amount;
	System.out.println("입금 : " + amount);	// 표시
	}

	@Override
	public void withdraw() {
		if(balance >= amount) { 
			amount = ip.howmuchWithdraw();
		balance -= amount;
		System.out.println("출금 : " + amount); // 표시
		}
		else {
			ip.notEnough();
		}
	}
	@Override
	public int getBalance() {
		return balance;
	}
	
	

	
}
