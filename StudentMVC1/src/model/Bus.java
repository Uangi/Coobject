package model;

public class Bus {

	// 버스 요금, 수입, 승객 수
	private final int busCost;	
	private int busIncome;
	private int busPassenger;
	
	public Bus(int busCost) {
		this.busCost = busCost;
	}
	
	public int getBusCost() {
		return busCost;
	}
	
	public int getBusIncome() {
		return busIncome;
	}

	public void setBusIncome(int busIncome) {
		this.busIncome = busIncome;
	}
	
	public int getBusPassenger() {
		return busPassenger;
	}

	public void setBusPassenger(int busPassenger) {
		this.busPassenger = busPassenger;
	}
	
	
	
}
