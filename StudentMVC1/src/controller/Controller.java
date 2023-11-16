package controller;

import java.util.Scanner;

import model.Bus;

import model.StudentModel;
import view.View;

public class Controller {

	Scanner sc = new Scanner(System.in);
	
	private StudentModel model;
	private View view;

	private StudentModel StudentModel;
	
	public Controller(StudentModel model, View view) {
		this.StudentModel = model;
		this.view = view;
		
	}
	
	public void setbusPassenger(int buspassenger) {
		model.setBusPassenger(buspassenger);
	}
	
	public void setbusIncome(int busincome) {
		model.setBusIncome(busincome);
	}
	
	
	public void performTake() {	//  버스탑승
		model.takeBus();
		view.busincomeMessage(model.getBusIncome());
	}
	
	public void performCount() {
		model.passengerCount();
		view.passCount(model.getBusPassenger());
	}
	
	public void performbusIncomeSum() {
		model.busIncomeSum();
		
	}
	
	
	
}
