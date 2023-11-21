package pre;

import java.util.Scanner;

public class busTest1 {
	private int bCost;
	private int busPassenger;
	private int income;
	private int firstmoney;
	private int resultmoney;
	private boolean isFirstExecution = true;

	public busTest1() {	// 수입의 메소드
		this.busPassenger = getBusPassenger();  // = 0;
		this.income = getIncome(); // = 0
		this.firstmoney = getFirstmoney();
		this.resultmoney = getResultmoney();
	}
	// tb.getbCost(), tb.getIncome() 고정 
	public int getIncome() {
		income += bCost;
		return income;
	}

	// 연동 테스트 22
	public int getbCost(int bCost) {	// 여기서 갑자기 원래값으로 반환
		Scanner sc2 = new Scanner(System.in);
		System.out.print("요금을 입력해주세요 : ");
		this.bCost = sc2.nextInt();
		return this.bCost;
	}

	public int getBusPassenger() {
		return busPassenger;
	}

	public int getFirstmoney() {	// 이후의 잔액
		updateResultmoney(); // 초기값 반환
		return firstmoney;
	}
	
	public int getResultmoney() {	
		resultmoney = firstmoney;
		return resultmoney;
	}
	
	public void updateResultmoney() {
		if(isFirstExecution) {	// 한번만 실행
			firstmoney = 10000;
			isFirstExecution = false;
		}
		firstmoney = firstmoney - bCost; // 첫 계산 후 초기 잔액값
}
	
	public void take() {	// 탑승
		busPassenger++;
	}
	
	
	public void busInfo(busTest1 tb) {
		System.out.println("버스요금 : " + tb.getbCost(this.bCost) + ", 승객 수 : " + tb.getBusPassenger() + " 명 "
	+ ", 수입은 : " + tb.getIncome() + "원, 현재 잔액은 : " + tb.getResultmoney() + "원, 탑승 후 잔액: " + getFirstmoney() + "원\n");
	}
	
}
//////////////두번째 클래스