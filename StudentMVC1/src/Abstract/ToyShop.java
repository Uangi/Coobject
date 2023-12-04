package Abstract;

import java.util.Scanner;

interface SelectToy {
	int apeachToy();
	int bearToy();
	int LionToy();
}

/* 장난감 가격 계산 클래스 */

class ToyShop implements SelectToy {

	private static final int APEACH_PRICE = 1000;
	private static final int BEAR_PRICE = 2000;
	private static final int LION_PRICE = 3000;
	Account ac = new Account();		// 무한 루프 
	public int newbalance;
	
	public ToyShop() {
		int newbalance;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int apeachToy() {
//	 	ac.balance -= APEACH_PRICE;
//		return ac.getBalance();
		int newbalance = ac.getBalance() - APEACH_PRICE;
        ac.setBalance(newbalance); // 업데이트된 잔액으로 설정
        return newbalance;
	}

	@Override
	public int bearToy() {
		return 0;
	}

	@Override
	public int LionToy() {
		return 0;
	}

}