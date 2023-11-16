package view;

import model.StudentModel;

public class View {

	private StudentModel studentModel;
	
	public void AppMessage() {
		System.out.println("프로그램 시작");
	}
	
	public void studentChoiceMessage() {
		System.out.println("뭐 탈래 ?");
	}
	
	
//	public void taxiRideMessage() {
//		System.out.println("학생 돈 : " + money + "승객 수 : " + busPassenger + "수입은 : " + taxiIncome);
//	}
	
	public View(StudentModel studentModel) {
        this.studentModel = studentModel;
    }
	public void busincomeMessage() {
        int busIncome = studentModel.getBusIncome();
        System.out.println("수입은 : "+ busIncome);
    }
	
	public void passCount() {
		int busPassenger = studentModel.getBusPassenger();
		System.out.println("승객 : " + busPassenger + "명");
	}
	
}
