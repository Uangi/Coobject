package Abstract;

import java.util.Scanner;

public class Input {

	static Scanner sc = new Scanner(System.in);
	
	public int howmuchDeposit() {
		System.out.print("얼마 입금하시겠습니까? : ");
		return sc.nextInt();
	}
	
	public String choiceToy() {
		System.out.print("어떤 장난감 살래? : ");
		return sc.next();
	}
	
	
	
	
	///////////////////////////
	public void notEnough() {
		System.out.println("잔액이 부족합니다.");
	}
	
	public void nowBalance(AccountService ac) {
		System.out.println("잔액은 : " + ac.getBalance());
	}
	
	public void buyAfterBalance(ToyShop ts) {
		System.out.println("잔액은 : " + ts.newbalance);
	}
}
