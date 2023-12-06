package ListStudy;

import java.util.List;
import java.util.Scanner;

public class NaverId {
	
		public boolean duplicatedIdSearch(List<NaverVO> user, String id) {
			for(NaverVO vo : user) {
				if(vo.getID().equals(id)) {
					return true;
				}
			}
			return false;
		}
		
		public void idCheck(List<NaverVO> user, NaverVO vo) {
		
		while (true) {
            try {
            	Scanner sc = new Scanner(System.in);
                System.out.print("ID : ");
                String id = sc.next();
                char ch;
                int eng = 0;
                int num = 0;

                if (id.length() < 8 || id.length() > 15) {
                    throw new Exception("8 이상 15 미만 자리의 수만 입력하세요.");
                }

                for (int i = 0; i < id.length(); i++) {
                    ch = id.charAt(i);
                    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                        eng++;
                    } else if (ch >= '0' && ch <= '9') {
                        num++;
                    }
                }

                if (eng == 0 || num == 0) {
                    System.out.println("영문, 숫자만 혼용 가능합니다.");
                    continue;
                }

                if (duplicatedIdSearch(user, id)) {
                    System.out.println("중복된 ID입니다.");
                } else {
                    vo.setID(id);
                    break; // 올바른 조건을 만족할 때 반복문 종료
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("다시 입력하세요");
            }
        }
    }

	public void idCreate (List<NaverVO> user, NaverVO vo) {
		try {
			idCheck(user,vo);	// 검사 후 등록
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}