package ListStudy;

import java.util.Scanner;


public class NaverMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Naver naver = new NaverFunc();
		
		int choice;
		
		while(true) {
			do {
				System.out.println("1. 회원가입 / 2. 전체 회원 출력 /"
						+ " 3. 회원 검색 / 4. 프로그램 종료 ");
				choice = sc.nextInt();
			}while(choice < 1);
			switch(choice) {
			case 1:
				naver.createanAccount();
				break;
			
			case 2:
				naver.allPrint();
				break;
				
			case 3:
				naver.searchUser();
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}