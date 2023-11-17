package pre;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		//System.out.println("잔액을 입력하세요 : ");
		//Scanner sc = new Scanner(System.in);
		//int money = sc.nextInt();
		
		
		Test1 t1 =  new Test1();
		//t1.takeBus();
		System.out.println("학생의 현재 이름 :" + t1.getStuName());
		System.out.println("학생의 현재 학년 :" + t1.getGrade());
		System.out.println("학생의 현재 돈 :" + t1.getMoney());
	}

}
