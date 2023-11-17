package pre;

import java.util.Scanner;

public class busTest1 {
	private int bCost;
	public int busPassenger;
	public int getbCost() {
		return bCost;
	}

	private int income;
	

	public busTest1(int bCost, int busPassenger, int income) {	// 수입의 메소드
		this.bCost = bCost;	// 버스 요금
		this.busPassenger = busPassenger;
		this.income = income;
	}
	
	public int getIncome() {
		return income;
	}

	public busTest1() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("요금을 입력해주세요.");
		this.bCost = sc2.nextInt();
		this.busPassenger = 0;
		this.income = 0;
	}
	
	public void take(int income) {
		this.income += bCost;
		busPassenger++;
	}
	
	public void busInfo() {
		System.out.println("버스요금 : " + bCost + ", 승객 수 : " + busPassenger + " 명 " + ", 수입은 : " + income );
	}
}
//////////////두번째 클래스