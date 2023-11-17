package pre;

import java.util.Scanner;

public class Test1 {
	
	private final String stuName;
	private final int grade;
	private int money;  

	/*
	 * 생성자에서 fianl을 써서 상수로 초기화, money = 3000이라면 초기화와 동시에 값 할당 만약 private final 쓰고
	 * money에 값을 주고싶다면 this.money를 초기화하는 생성자2 만듬. 그래서 값이 변경이 안되기 때문에 setmoney 를 사용할
	 * 필요가 없음. 결국 main 에서 getMoney로 값을 읽어올 순 있지만 setMoney로 변경이 안되서 사용안함. final을 사용하지
	 * 않고 private만 걸어두고 입력받는 방법은 생성자 2에서 스캐너 객체 만들고 this.?? = sc.nextInt(); 이렇게하면 됨
	 */
	public Test1(String stuName, int grade, int money) { // 생성자 
		this.stuName = stuName;
		this.grade = grade;
		this.money = money;
	}
	public Test1() { // 생성자 2
		Scanner sc = new Scanner(System.in);
		System.out.println("잔액을 입력하세요 : ");
		this.money = sc.nextInt();
		//sc.nextLine();
		this.stuName = "박진영";
		this.grade = 3;
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
	public void setMoney(int money) {
		this.money = money;
	}
	public void takeBus(Test2 tb) {
		tb.take(1000);	// 버스 요금 1000원
		//this.money -= tb.income;
		
	}
}
