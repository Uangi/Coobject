package pre2;

import java.util.Scanner;

public class busTest2 {
	
	private int bCost;
	private int busPassenger;
	private int income;
	private int firstmoney;
	private int resultmoney;
	private boolean isFirstExecution = true;

	public busTest2() {	// 수입의 메소드
		this.busPassenger = getBusPassenger();  // = 0;
		this.income = getIncome(); // = 0
		this.firstmoney = getFirstmoney();
		this.resultmoney = getResultmoney();
	}
	

	public int getbCost(int bCost) {	
		Scanner sc = new Scanner(System.in);
		System.out.print("요금을 입력해주세요 : ");
		this.bCost = sc.nextInt();
		return this.bCost;
	}

	public int getBusPassenger() {
		return busPassenger;
	}

	public int getIncome() {
		income += bCost;
		return income;
	}
	
	public int getFirstmoney() {	// 탑승 후의 잔액
		updateResultmoney(); // 초기값 반환
		return firstmoney;
	}
	
	public int getResultmoney() {	// 현재 잔액
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
	
	public void take() {	// 승객 수 증가
		busPassenger++;
	}
	
	public void busInfo(busTest2 tb) {
		System.out.println("버스요금 : " + tb.getbCost(this.bCost) + "원 , 버스승객 수 : " + tb.getBusPassenger() + " 명 "
		+ ", 수입은 : " + tb.getIncome() + "원, 현재 잔액은 : " + 
		tb.getResultmoney() + "원, 탑승 후 잔액: " + getFirstmoney() + "원\n");
	}
	
	public void busStart() {
		int ch = 0;
		TransView tv = new TransView();
		stuTest2 st2 =  new stuTest2(0);
		busTest2 bt2 =  new busTest2();
		
		
		//TransView.studentChoiceMessage(st);
		
		st2.stuInfo(bt2);
		st2.takeBus(bt2);	// 버스 요금 출력 -> 수입 += 비용, 승객수 증가, return income
		bt2.busInfo(bt2);
		do {
		busTest2 t2_2 =  new busTest2();
		st2.takeBus(bt2);	// 여기서 원래값
		bt2.busInfo(bt2);
		
		ch++;
		} while(ch < 3);
	}
}
//////////////두번째 클래스