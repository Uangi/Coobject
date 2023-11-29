package main;

import java.util.Scanner;

import controller.Main;
import model.StudentModel;
import view.Display;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("버스요금 입력 : ");
		
		int buscost = sc.nextInt();
		StudentModel model = new StudentModel();
		Display view = new Display(model);
		Main controller = new Main(model, view);
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
	