package String_Calculator2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class numberInput {

	// 리스트 생성
	List<Integer> number = new ArrayList<Integer>();
	List<String> operator = new ArrayList<String>();
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.println((i+1) + "번째 정수 입력 : ");
			int num = sc.nextInt();
			number.add(num);	// 리스트에 값 넣기
			}
			
		for(int i = 0; i < 3; i++) {
			System.out.println(" 기호 입력 : ");
			String oper = sc.next();
			operator.add(oper);
		}
	}
	
	public void Output(Calculator ca) {
		System.out.println("결과 : " + ca.result);
	}
}
