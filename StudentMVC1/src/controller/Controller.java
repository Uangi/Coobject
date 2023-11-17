package controller;

import java.util.Scanner;


import model.StudentModel;
import view.View;

public class Controller {

	Scanner sc = new Scanner(System.in);
	
	private StudentModel model;
	private View view;

	private StudentModel StudentModel;
	
	public Controller(StudentModel model, View view) {
		this.model = model;
		this.view = view;
		
	}
	
	public void setbusPassenger(int buspassenger) {
		model.setBusPassenger(buspassenger);
	}
	
	public void setbusIncome(int busincome) {
		model.setBusIncome(busincome);
	}
	
	public void setbusCost(int buscost){
		model.setBusCost(buscost);
	}
	
	public void performTake() {	//  버스탑승
		model.takeBus();
		view.busincomeMessage();
	}
	
	public void performCount() {
		model.passengerCount();
		view.passCount();
	}
	
	public void performbusIncomeSum() {
		model.busIncomeSum();
		
	}
	
	
	
}
