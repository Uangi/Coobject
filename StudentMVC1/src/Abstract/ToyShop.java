package Abstract;

import java.util.Scanner;

interface SelectToy {
	int apeachToy(AccountService ac);
	int bearToy();
	int LionToy();
}

/* 장난감 가격 계산 클래스 */

class ToyShop implements SelectToy {

	private static final int APEACH_PRICE = 1000;
	private static final int BEAR_PRICE = 2000;
	private static final int LION_PRICE = 3000;
	
	Account ac = new Account();
	
	@Override
	public int apeachToy(AccountService ac) {
		ac.balance -= APEACH_PRICE;
		return ac.balance;
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