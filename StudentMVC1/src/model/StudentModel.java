package model;
import controller.Controller;
public class StudentModel {

	private  String name = "박진영";
	private  int grade = 3;
	private  int money = 5000;	// 잔액
	private  int buscost;
	private int busincome;
	private int buspassenger;
	

	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}

	public int getMoney() {
		return money;
	}
	
	public int getbusCost() {
		return buscost;
	}
	
	public int getBusIncome() {
		return busincome;
	}
	
	public void setBusCost(int buscost) {
        this.buscost = buscost;
    }
	
	public void setBusIncome(int busIncome) {
		this.busincome = busIncome;
	}
	
	
	public int getBusPassenger() {
		return buspassenger;
	}
	
	public void setBusPassenger(int busPassenger) {
		this.buspassenger = busPassenger;
	}
	
	// 계산 로직
	public void takeBus() {	// 잔액 차감
		this.money = money - buscost;
	}
	
	public void passengerCount() { // 승객 수
		buspassenger++;
	}
	
	public void busIncomeSum() { // 버스 수입 계산
		busincome += buscost;
	}
	
	
	
	
}
