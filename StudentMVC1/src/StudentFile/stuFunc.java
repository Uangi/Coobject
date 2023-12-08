package StudentFile;

import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stuFunc implements Serializable {

   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private List<stuVO> user = new ArrayList<>();
   private List<stuVO> uniqueUsers = new ArrayList<>();
   Scanner sc = new Scanner(System.in);
   
   public void Input() {
        stuVO vo = new stuVO();
        try {
            System.out.print("이름: ");
            vo.setName(sc.next());

            System.out.print("생일: ");
            vo.setBirth(sc.next());

            System.out.print("점수: ");
            vo.setScore(sc.nextInt());

            user.add(vo);
            System.out.println("추가 성공!");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

   private boolean containsName(List<stuVO> userList, String name) {
       for (stuVO vo : userList) {
           if (vo.getName().equals(name)) {
               return true;  // 이름이 이미 존재하면 true 반환
           }
       }
       return false;
   }
   
    public List<stuVO> getUser(List<stuVO> userList) {
           for (stuVO vo : userList) {   // 입력된 목록 순회 -> 목록에 포함X -> 추가
               if (!containsName(uniqueUsers,vo.getName())) {
                   uniqueUsers.add(vo);
               }
           }
           return uniqueUsers;
    }

    public void Print() {
       try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\doc\\student8.txt"))) {
            List<stuVO> loadedUsers = (List<stuVO>) ois.readObject();   // 파일 읽어온거 loadedUser에 저장
            List<stuVO> uniqueUsers = getUser(loadedUsers);
            // 먼저 생성한 객체에 중복 검사용으로 넣어둠 -> 검증 후 uniqueUsers에 대입
            for (stuVO vo : uniqueUsers) {
                System.out.println(vo.toString());
            }
        } catch (EOFException e) {   // 파일 끝까지 읽기
            System.out.println("데이터를 모두 읽었습니다.");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    public void Quit() {
       try {
           FileOutputStream fos = new  FileOutputStream("c:\\doc\\student8.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(getUser(user));
            System.out.println("데이터 저장 완료!");

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

   
}