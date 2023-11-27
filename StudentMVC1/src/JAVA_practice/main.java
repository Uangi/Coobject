package JAVA_practice;

import java.util.Scanner;

public class main {

	private static int[] num = new int[4];
	
	public static int num1,num2,num3,num4 = 0;
	static String oper1, oper2, oper3;
	
	
	public static void Input() {
		Scanner sc = new Scanner(System.in);
//		for(int i =  0; i < num.length; i++) {
//			System.out.print((i+1) + "번째 정수 입력 : ");
//		}
		System.out.println("정수 입력");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("기호 입력");
		oper1 = sc2.next();
		oper2 = sc2.next();
		oper3 = sc2.next();
	}
	
	public static void calc() {
		Calculator.FirstCalc();
		Calculator.SecondCalc();
		Calculator.ThirdCalc();
	}
	public static void main(String[] args) {
		Input();
		calc();
		System.out.println(num1 + oper1 + num2 + oper2 + num3 + oper3 + num4 + " = " + Third.result3);
		System.out.printf("%2d%2s%2d%2s%2d%2s%2d = %.2f",num1,oper1,num2,oper2,num3,oper3,num4,Third.result3 );
	}	
}
