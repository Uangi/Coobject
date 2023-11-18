package pre;

import java.util.Scanner;

public class busTest1 {
	private final int bCost;
	private int busPassenger;
	private int income;
	
//	public int getbCost() {
//		return bCost;
//	}

	public busTest1() {	// 수입의 메소드
		Scanner sc2 = new Scanner(System.in);
		System.out.println("요금을 입력해주세요.");
		this.bCost = sc2.nextInt();
		this.busPassenger = getBusPassenger();  // = 0;
		this.income = getIncome(); // = 0;
	}
	// tb.getbCost() 고정, tb.getIncome()은 잘 읽는 대신
	public int getIncome() {
		return income;
	}

	// 연동 테스트 22
	public int getbCost() {
		return bCost;
	}

	public int getBusPassenger() {
		return busPassenger;
	}

	public int take(int income) {	// public void take(int income)
		this.income += bCost;		// this.income += bCost;
		busPassenger++;
		return getIncome();						// busPassenger++;
	}
	
	public void busInfo(busTest1 tb) {
		System.out.println("버스요금 : " + tb.getbCost() + ", 승객 수 : " + tb.getBusPassenger() + " 명 " + ", 수입은 : " + tb.getIncome() );
	}
}
//////////////두번째 클래스