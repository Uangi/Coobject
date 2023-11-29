package view;


public class Display {

	private Display() {
		
	}
	public static void showresult() {
		System.out.printf("계산 결과는 : %.1f입니다." );
	}
	
	public static void CalcInput() {
		System.out.print("수식을 입력하세요 : ");
	}
}
