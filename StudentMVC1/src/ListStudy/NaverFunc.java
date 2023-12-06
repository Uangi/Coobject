package ListStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NaverFunc implements Naver{

	private List<NaverVO> user = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	NaverId nic = new NaverId();
	NaverPassword npc = new NaverPassword();
	
	@Override
	 public void createanAccount() {
        NaverVO vo = new NaverVO(); // 객체 생성 이후 정보주입
        nic.idCreate(user, vo);
        npc.passwordCreate(vo); // 1차 비밀번호 생성

        System.out.print("이름 : ");
        vo.setNAME(sc.next());

        System.out.print("성별 : ");
        vo.setGENDER(sc.next());

        System.out.print("생일 : ");
        vo.setBIRTH(sc.nextInt());

        System.out.print("이메일 : ");
        vo.setEMAIL(sc.next());

        System.out.print("전화번호 : ");
        vo.setTEL(sc.nextInt());

        user.add(vo);
        System.out.println("추가 성공!");
    }

	 public List<NaverVO> getUser() {	// 리스트에 유저 정보 넣기
	        return user;
	    }

	@Override
	public void allPrint() {
        for (NaverVO vo : user) {
            System.out.println(vo.toString());
        }
    }

	@Override
	public void searchUser() {
        System.out.println("찾을 ID : ");
        String id = sc.next();

        if (!nic.duplicatedIdSearch(user, id)) {
            System.out.println("ID가 없습니다.");
            return;
        }

        for (NaverVO vo : user) {
            if (vo.getID().equals(id)) {
                System.out.println("검색한 회원정보입니다.");
                System.out.println(vo.toString());
            }
        }
    }

}
