package pre;

import java.util.Scanner;

public class busTest1 {
	private int bCost;
	private int busPassenger;
	private int income;
	private int resultmoney;
	private int resultmoney2;
//	public int getbCost() {
//		return bCost;
//	}

	public busTest1() {	// 수입의 메소드
		this.busPassenger = getBusPassenger();  // = 0;
		this.income = getIncome(); // = 0
		this.resultmoney = getResultmoney();
		this.resultmoney = getResultmoney2();
	}
	// tb.getbCost(), tb.getIncome() 고정 
	public int getIncome() {
		income += bCost;
		return income;
	}

	// 연동 테스트 22
	public int getbCost(int bCost) {	// 여기서 갑자기 원래값으로 반환
		Scanner sc2 = new Scanner(System.in);
		System.out.println("요금을 입력해주세요.");
		this.bCost = sc2.nextInt();
		return this.bCost;
	}

	public int getBusPassenger() {
		return busPassenger;
	}

	public int getResultmoney() {
		updateResultmoney(); // 초기값 반환
		return resultmoney;
	}
	
	public int getResultmoney2() {	// 이후의 잔
		if(resultmoney == 10000) {
		this.resultmoney2 = resultmoney - bCost;
		}
		this.resultmoney2 -= bCost;
		
		return this.resultmoney2;
	}
	
	public void updateResultmoney() {
		resultmoney = 10000 - bCost; // 첫 계산 후 초기 잔액값
		}
	public void take() {	// public void take(int income)
		busPassenger++;
								// return getIncome();
	}
	
//	public void resultMoney(stuTest1 ts) {
//		resultmoney = ts.getMoney() - bCost;
//		
//	}
	
	public void busInfo(busTest1 tb) {
		System.out.println("버스요금 : " + tb.getbCost(this.bCost) + ", 승객 수 : " + tb.getBusPassenger() + " 명 "
	+ ", 수입은 : " + tb.getIncome() + ", 잔액은 : " + tb.getResultmoney2());
	}
	
}
//////////////두번째 클래스