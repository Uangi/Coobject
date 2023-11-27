package String_Calculator;

import java.util.Scanner;

/*사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
 * 
문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다.

 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
 
예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
											
*
*/
public class StringCalculator {

	
	private static String[] oper = new String[3];
	private static int[] num = new int[4];
	private static double[] result = new double[3];
	
	public static void numPush() {
		Scanner sc = new Scanner(System.in);
		for(int i =  0; i < num.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			num[i] = sc.nextInt();
		}
	}	
	
	public static void Calc() {
		for(int i = 0; i < num.length-2; i++)	{// 0 1 2 3
			 if (oper[i].equals("+")) {
	                result[i] = num[i] + num[i + 1];
	                result[1] = result[0] + num[2];
	                result[2] = result[1] + num[3];
	            } 
			 else if (oper[i].equals("-")) {
	                result[i] = num[i] - num[i + 1];
	            } 
			 else if (oper[i].equals("*")) {
	                result[i] = num[i] * num[i + 1];
	            } 
			 else if (oper[i].equals("/")) {
	                result[i] = (double) num[i] / num[i + 1];
	            }
		if (i > 0) {
            result[i] = result[i - 1] + result[i];
        	}
		}
	}
	// 1 + 2 * 3 - 4 =  5 가 나오면 됨
	public static void input2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("기호 입력");
		for(int i =  0; i < oper.length; i++) {
		oper[i] = sc.next();
		oper[i] = oper[i].replace("\n","").replace("\r", "");
			}
//		for(int n : num) {
//			System.out.print(num[n-1] + " " + oper[n]);
//		}
	}
	
	public static void output() {
		System.out.print("결과 : " + result[2]);
	}
	
	public static void main(String[] args) {

		numPush();
		input2();
		Calc();
		output();
		//if(oper[0] == "*" || oper[0] == "/") {
	}
	
}

