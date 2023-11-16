package model;

public class Student {

	private final String name = "박진영";
	private final int grade = 3;
	private final int money = 5000;	// 잔액
	private final Bus bus;
	
	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public Student(Bus bus) {
        this.bus = bus;
    }
	
	public int setBusCost(int busCost) {
		this.busCost = busCost;
	}
	public void takeBus() {	// 돈 차감
		money = money - bus.getBusCost();
	}
}
