package Abstract;

import java.util.Scanner;

interface AccountService {
	void deposit();
	void choiceToy();
	int getBalance();
}

class Account implements AccountService {
	
	public int amount;	// 입금액?
	public int balance;	// 잔액
	public char T;	// 장난감 선택
	
	Scanner sc = new Scanner(System.in);
	Input ip = new Input();
	SelectToy ts = new ToyShop();
	
	@Override
	public void deposit() {	
	amount = ip.howmuchDeposit();	// static을 쓰거나 객체 생성하거나
	balance += amount;
	System.out.println("입금 : " + amount);	// 표시
	}

	@Override
	public void choiceToy() { // 여러 개 고를 수 있게 하기
		if(T == 'A') {
			ts.apeachToy();	// static 을 쓰려면 인터페이스 X
			
		}
		else if(T == 'B') {
			ts.bearToy();
		}
		else if(T == 'L') {
			ts.LionToy();
		}
		else {
			ip.notEnough();
		}
	}
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}

	@Override
	public int getBalance() {
		return balance;
	}
	
	

	
}
