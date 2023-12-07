package StudentFile;

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

    public List<stuVO> getUser(List<stuVO> existingData) {
        return user;
    }

    public void Print() {
    	 try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\doc\\student8.txt"))) {
    	        List<stuVO> existingData;
    	        while (true) {
    	            try {
    	                existingData = (List<stuVO>) ois.readObject();
    	                if (existingData.isEmpty()) {
    	                    break; // 파일의 끝에 도달하고 데이터가 없으면 루프를 종료
    	                }
//    	                user.addAll(existingData);
    	            } catch (EOFException e) {
    	                break; // 파일의 끝에 도달하면 루프를 종료
    	            }
    	        }

    	        for (stuVO vo : user) {
    	            System.out.println(vo.toString());
    	        }
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
