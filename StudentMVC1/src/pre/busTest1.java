package pre;

import java.util.Scanner;

public class busTest1 {
	private int bCost;
	private int busPassenger;
	private int income;
	
//	public int getbCost() {
//		return bCost;
//	}

	public busTest1() {	// 수입의 메소드
		Scanner sc2 = new Scanner(System.in);
		System.out.println("요금을 입력해주세요.");
		this.bCost = sc2.nextInt();
		this.busPassenger = busPassenger;  // = 0;
		this.income += getbCost(); // = 0;
	}
	
	public int getIncome() {
		return income;
	}

	
	public int getbCost() {
		return bCost;
	}

	public int getBusPassenger() {
		return busPassenger;
	}

//	public void take(int income) {	// public void take(int income)
//		this.income += this.bCost;		// this.income += bCost;
//		//busPassenger++;							// busPassenger++;
//	}
	
	public int busMoney() {
		this.income += getbCost();
		return income;
	}
	
	public void busPass() {	// 승객 수
		busPassenger++;
	}
	public void busInfo(busTest1 tb) {
		System.out.println("버스요금 : " + tb.getbCost() + ", 승객 수 : " + tb.getBusPassenger() + " 명 " + ", 수입은 : " + tb.getIncome() );
	}
}
//////////////두번째 클래스