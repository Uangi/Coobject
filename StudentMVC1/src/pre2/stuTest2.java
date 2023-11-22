package pre2;

import java.util.Scanner;

public class stuTest2 {
	
	private final String stuName;
	private final int grade;
	private final int money = 10000;  
	/*
	 * 생성자에서 fianl을 써서 상수로 초기화, money = 3000이라면 초기화와 동시에 값 할당 만약 private final 쓰고
	 * money에 값을 주고싶다면 this.money를 초기화하는 생성자2 만듬. 그래서 값이 변경이 안되기 때문에 setmoney 를 사용할
	 * 필요가 없음. 결국 main 에서 getMoney로 값을 읽어올 순 있지만 setMoney로 변경이 안되서 사용안함. final을 사용하지
	 * 않고 private만 걸어두고 입력받는 방법은 생성자 2에서 스캐너 객체 만들고 this.?? = sc.nextInt(); 이렇게하면 됨
	 */
	public stuTest2(int money) { // 생성자 
		this.stuName = "박진영";
		this.grade = 3;
	}
	
	public String getStuName() {
		return stuName;
	}

	public int getGrade() {
		return grade;
	}
	
	public int getMoney(busTest2 tb) {
		tb.updateResultmoney();
		tb.getResultmoney();
		return money;
	}
	
	public void takeBus(busTest2 tb) {
		tb.take();	// tb.take(tb.getIncome()); X -> busInfo에서도 getIncome()을 사용하면 이것까지 총 2번 호출이 되기 때문에 사용 x
		tb.getBusPassenger();
	}
	public void stuInfo(busTest2 tb) {
		System.out.println("학생 이름 : " + getStuName() + ", 현재 학년 : " +
				getGrade());
	}
	
	//////////////////////////////////////////////
	public void studentChoice(String choice) {
		Scanner sc = new Scanner(System.in);
		choice = sc.nextLine();	
		if("버스".equals(choice)) {
			// 버스 메소드 시작
			System.out.println("버스 메소드 시작");
		}
		else if("택시".equals(choice)) {
			// 택시 메소드 시작
			System.out.println("택시 메소드 시작");
		}
		else { 
			// 예외처리 메소드 시작
			System.out.println("예외처리 메소드 시작");
		}
		
		System.out.println(choice);
	}
	
	/////////////////// 런
//	public static void run() {
//		
//		int ch = 0;
//		TransView tv = new TransView();
//		stuTest2 st2 =  new stuTest2(0);
//		
//		busTest2 bt2 =  new busTest2();
//		
//		
//		//TransView.studentChoiceMessage(st);
//		
//		st2.stuInfo(bt2);
//		st2.takeBus(bt2);	// 버스 요금 출력 -> 수입 += 비용, 승객수 증가, return income
//		bt2.busInfo(bt2);
//		do {
//		busTest2 t2_2 =  new busTest2();
//		st2.takeBus(bt2);	// 여기서 원래값
//		bt2.busInfo(bt2);
//		
//		ch++;
//		} while(ch < 3);
//	}
}
//////////첫번째 클래스