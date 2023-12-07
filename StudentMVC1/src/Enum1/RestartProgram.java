package Enum1;

import java.util.Scanner;



public class RestartProgram {
	Scanner sc = new Scanner(System.in);
	String str1, str2;
	enum RestartDecision {
        RESTART, QUIT
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("프로그램을 재시작하시겠습니까? (RESTART/QUIT)");
            String userInput = scanner.next().toUpperCase();

            try {
                RestartDecision decision = RestartDecision.valueOf(userInput);
                performAction(decision);
            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }

        } while (true);
    }

    private static void performAction(RestartDecision decision) {
        switch (decision) {
            case RESTART:
                System.out.println("프로그램을 재시작합니다.");
                // 여기에 프로그램 재시작을 위한 로직을 추가할 수 있습니다.
                break;
            case QUIT:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
        }
    }
}


