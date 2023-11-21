package pre;

import java.util.Scanner;

public class stuTest1 {
	
	private final String stuName;
	private final int grade;
	private int money = 10000;  
	/*
	 * 생성자에서 fianl을 써서 상수로 초기화, money = 3000이라면 초기화와 동시에 값 할당 만약 private final 쓰고
	 * money에 값을 주고싶다면 this.money를 초기화하는 생성자2 만듬. 그래서 값이 변경이 안되기 때문에 setmoney 를 사용할
	 * 필요가 없음. 결국 main 에서 getMoney로 값을 읽어올 순 있지만 setMoney로 변경이 안되서 사용안함. final을 사용하지
	 * 않고 private만 걸어두고 입력받는 방법은 생성자 2에서 스캐너 객체 만들고 this.?? = sc.nextInt(); 이렇게하면 됨
	 */
	public stuTest1() { // 생성자 
		this.stuName = "박진영";
		this.grade = 3;
		this.money = 10000;
		Scanner sc = new Scanner(System.in);
		//System.out.println("잔액을 입력하세요 : ");
		//this.money = sc.nextInt();
		//sc.nextLine();	// 개행문자처리
		
	}
	
	public String getStuName() {
		return stuName;
	}

	public int getGrade() {
		return grade;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void takeBus(busTest1 tb) {
		tb.take();	// tb.take(tb.getIncome()); X -> busInfo에서도 getIncome()을 사용하면 이것까지
		// 총 2번 호출이 되기 때문에 사용 x
		//this.money -= tb.getbCost();
		//tb.take(tb.busPassenger);
		tb.getBusPassenger();
	}
	public void stuInfo(busTest1 tb) {
		System.out.println("학생 이름 : " + getStuName() + ", 현재 학년 : " +
				getGrade() + ", 현재 돈 :" + getMoney());
	}
	public static void run() {
		int ch = 0;
		stuTest1 t1 =  new stuTest1();
		busTest1 t2 =  new busTest1();
		t1.stuInfo(t2);
		t1.takeBus(t2);	// 버스 요금 출력 -> 수입 += 비용, 승객수 증가, return income
		
		t2.busInfo(t2);
		do {
		
		busTest1 t2_2 =  new busTest1();
		t1.takeBus(t2);	// 여기서 원래값
		t2.busInfo(t2);
		
		ch++;
		} while(ch < 3);
	}
}
//////////첫번째 클래스