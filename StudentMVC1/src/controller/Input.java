package controller;

import java.util.Scanner;
import java.util.StringTokenizer;

	// 입력값 private static final로 설정

public class Input {
		private static final Scanner sc = new Scanner(System.in);
		public String inputstring;
		
		private Input() {}	// 생성자 이유?
		/* 클래스를 final로 선언하지 않았더라도 
		 * 생성자를 private으로 선언함으로써 상속을 막을 수 있다 */
		
		/* 상속을 막는 이유? 
		 * 협업 시 같은 메소드명 방지, 클래스 내부 기능이나 상태를 감추고싶을 때
		 * */
		
		public static String Input() {
			String inputstring = sc.nextLine();
			sc.close();
			return inputstring;
	}
	
}
