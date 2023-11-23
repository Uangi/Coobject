package Function;

import java.util.Scanner;

public class stuTest {

	public String name;
	public int grade;
	public int MONEY;
	
	public stuTest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
    	name = sc.nextLine();

    	System.out.println("학년을 입력하세요 : ");
    	grade = sc.nextInt();
		
    	System.out.println("현재 가지고 있는 잔액을 입력하세요 : ");
    	MONEY = sc.nextInt();
    	
		
	}

	public static void run(practiceVector vc) {
		stuTest st = new stuTest();
		vc.vecvec(st);
	}
}
