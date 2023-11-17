package main;

import java.util.Scanner;

import controller.Controller;
import model.StudentModel;
import view.View;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("버스요금 입력 : ");
		
		int buscost = sc.nextInt();
		StudentModel model = new StudentModel();
		View view = new View(model);
		Controller controller = new Controller(model, view);
		controller.setbusIncome(buscost);
		
		
		System.out.println("출력중");
		controller.performTake();
		controller.performCount();
		controller.performbusIncomeSum();
		ch++; 
		if(ch == 3) {
			break;
		}
		}
		
	}

}
	