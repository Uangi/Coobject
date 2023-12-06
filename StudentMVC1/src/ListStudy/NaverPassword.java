package ListStudy;

import java.util.Scanner;

public class NaverPassword {

	Scanner sc = new Scanner(System.in);
	
	public void secondPasswordCheck(NaverVO vo) {
	    Scanner sc = new Scanner(System.in);
	    while (true) {
	        try {
	            System.out.print("비밀번호 재확인 : ");
	            vo.setPW2(sc.next());

	            if (vo.getPW2().equals(vo.getPW1())) {
	                break; // 비밀번호가 일치하면 반복문 종료
	            } else {
	                throw new Exception("비밀번호가 같지 않습니다. 다시 입력하세요.");
	            }
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	    }
	}

	public void passwordCreate(NaverVO vo) {
	    System.out.print("비밀번호 : ");
	    vo.setPW1(sc.next());
	    
	    secondPasswordCheck(vo);
	}
}
