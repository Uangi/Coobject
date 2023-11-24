package pre3;

import java.util.Scanner;

public class stuTest3 {
	
	private static final int MONEY = 10000;
	private static int balance = 10000;
	private final String stuName = "박진영";
	private final int grade = 3;
	private boolean BusisFirstExecution;
	private boolean TaxiisFirstExecution;
	public int Balance = 0;
	private shareMoney sharemoney;
	
	/*
	 * 생성자에서 fianl을 써서 상수로 초기화, money = 3000이라면 초기화와 동시에 값 할당 만약 private final 쓰고
	 * money에 값을 주고싶다면 this.money를 초기화하는 생성자2 만듬. 그래서 값이 변경이 안되기 때문에 setmoney 를 사용할
	 * 필요가 없음. 결국 main 에서 getMoney로 값을 읽어올 순 있지만 setMoney로 변경이 안되서 사용안함. final을 사용하지
	 * 않고 private만 걸어두고 입력받는 방법은 생성자 2에서 스캐너 객체 만들고 this.?? = sc.nextInt(); 이렇게하면 됨
	 */
	
	public interface shareMoney {
		
		public int firstTaxi();
		public int firstBus();
		public void getBalance();
		
	}

	public void setshareMoney(shareMoney sharemoney) {
		this.sharemoney = sharemoney;
	}
	
	public String getStuName() {
		return stuName;
	}

	public int getGrade() {
		return grade;
	}
	
	public int getMONEY() {
		
		return MONEY;
	}

	public void takeBus(busTest3 tb) {
		tb.Btake(null);
		tb.getBusPassenger();
	}
	
	public void takeTaxi(taxiTest3 tt) {
		tt.Ttake(null);	
		tt.getTaxiPassenger();
	}
	public void stuInfo() {
		System.out.println("학생 이름 : " + getStuName() + ", 현재 학년 : " +
				getGrade());
	}
	
	
	public int getBalance() {	// 현재 잔액
		
		return Balance;
	}
	
	
	public void updateBalance() { // 탑승 후 잔액
		
	}
	
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
	
}
//////////첫번째 클래스