package StudentFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import StudentFile.stuVO;

public class stuFunc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<stuVO> user = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	private int data = 0;
	
	public void Input() {
				stuVO vo = new stuVO();
		try {
			 	System.out.print("이름 : ");
		        vo.setName(sc.next());

		        System.out.print("생일 : ");
		        vo.setBirth(sc.next());

		        System.out.print("점수 : ");
		        vo.setScore(sc.nextInt());
		        
		        user.add(vo);
		        System.out.println("추가 성공!");
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

	public List<stuVO> getUser() {	// 리스트에 유저 정보 넣기
        return user;
    }
	
	
	public void Print() {		// 출력스트림 불러와서 파일에 있는 내용 읽기
//		for (stuVO vo : user) {
//            System.out.println(vo.toString());
//        }
		try {
			FileInputStream fis = 
					new FileInputStream("c:\\doc\\student1.txt");
			ObjectInputStream ois =
					new ObjectInputStream(fis);
			while((data = fis.read()) != -1) {
				System.out.write(data);	// 해당 위치에 있는 파일을 읽어와서 콘솔에 띄우기
				System.out.flush();
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
			
	}
	
	public void Quit() {
		try {
			FileOutputStream fos = 
					new  FileOutputStream("c:\\doc\\student1.txt");
			ObjectOutputStream oos = 	// 감싼거
					new ObjectOutputStream(fos);
			
			while((data = System.in.read())!=-1) {
				oos.writeObject(user);	// 파일로 내보내기
				oos.flush();
			}
			
			oos.close();
	} catch(Exception e) {
		System.err.println(e.toString());
		}
		
	}
	
	
	
	-------------------------------
	List<stuVO> existingData = (List<stuVO>) ois.readObject();
//  user.clear();
  user.addAll(existingData);

  for (stuVO vo : user) {
      System.out.println(vo.toString());    
  }

} catch (Exception e) {
  System.err.println(e.toString());
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
