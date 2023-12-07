package StudentFile;

import java.util.Scanner;

public class stuMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stuFunc stu = new stuFunc();
		
		int choice;
		
		while(true) {
			do {
				System.out.print("1. 입력 / 2. 출력 / 3. 종료 => ");
				choice = sc.nextInt();
			}while(choice < 1);
			switch(choice) {	
			case 1:
				stu.Input();
				break;
			
			case 2:
				stu.Print();
				break;
				
			case 3:
				stu.Quit();
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}
