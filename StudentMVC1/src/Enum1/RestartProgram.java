package Enum1;

import java.util.Scanner;

public enum RestartOption {
	RESTART("1"), END("2");
	
	private String value;
	
	private RestartOption(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}

public class RestartProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("프로그램 다시 시작? : ");
			String userInput = sc.nextLine().toUpperCase();
		} while(getUserDicision(sc));
		sc.close();
	}

	private static boolean getUserDicision(Scanner sc) {
		System.out.println("프로그램을 계속 진행할래? 진행(1) / 종료(2)");
		String userInput = sc.nextLine();
//		return RestartOption.valueOf(userInput).equals(RestartOption.RESTART("1"));
		return RestartOption.RESTART.getValue().equals(userInput);
	}
}


