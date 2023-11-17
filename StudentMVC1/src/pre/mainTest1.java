package pre;

import java.util.Scanner;

public class mainTest1 {

	public static void main(String[] args) {
		
		stuTest1 t1 =  new stuTest1();
		busTest1 t2 =  new busTest1();
		
		t1.takeBus(t2);
		//System.out.println("학생의 현재 이름 :" + t1.getStuName() + "학생의 현재 학년 :"
		//+ t1.getGrade() + "학생의 현재 돈 :" + t1.getMoney());
		t1.stuInfo();
		t2.busInfo();
	}

}
