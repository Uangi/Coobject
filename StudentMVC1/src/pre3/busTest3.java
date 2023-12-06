package pre3;

import java.util.Scanner;

import Function.shareMoney;

public class busTest3 implements View {
	
	private int bCost;
	private int busPassenger;
	private int income;
	
	private boolean BusisFirstExecution = true;

	public busTest3() {	// 수입의 메소드
		this.busPassenger = getBusPassenger();  // = 0;
		this.income = getIncome(); // = 0
		
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
	
	public int firstBus(stuTest3 st2) {
		if(BusisFirstExecution) {	// 버스가 제일 먼저 선택 된다면
			st2.Balance = st2.getMONEY() - bCost;
			BusisFirstExecution = false;
			}
		return st2.Balance;
	}
	
	public int Btake(stuTest3 st2) {	// 승객 수 증가	// public void Btake() {
		 if (st2 != null) {
		        st2.Balance -= bCost;
		        busPassenger++;
		    } else {
		    	System.out.println("오류 발생");
		        // st2가 null인 경우 예외처리 또는 다른 로직 수행
		    }
		 return st2.Balance;
	}
	
	
	public void busInfo(busTest3 tb, stuTest3 st2) {
		System.out.println("버스요금 : " + tb.getbCost(this.bCost) + "원 , 버스승객 수 : " + tb.getBusPassenger() + " 명 "
		+ ", 버스수입은 : " + tb.getIncome() + "원, 현재 잔액은 : " 
		 + st2.Balance + "원, 탑승 후 잔액: "   + "원\n");
	}
	
	public void busStart() {
		int ch = 0;
		TransView tv = new TransView();
		stuTest3 st2 =  new stuTest3();
		busTest3 bt2 =  new busTest3();
		firstBus(st2);
		st2.stuInfo();
		st2.takeBus(bt2);	// 버스 요금 출력 -> 수입 += 비용, 승객수 증가, return income
		bt2.busInfo(bt2,st2);
		
			st2.takeBus(bt2);	// 여기서 원래값
			bt2.busInfo(bt2,st2);
	}

	@Override
	public void busMoney() {
	}

	@Override
	public void taxiMoney() {
	}

	@Override
	public void getBalance() {
	}
}
		
//////////////두번째 클래스