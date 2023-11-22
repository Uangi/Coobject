package pre;

public class Test3 {

	private String name = "박진영";
	int grade = 3;
	int money = 5000;
	
	public int getGrade() {
		return grade;
	}

	public int getMoney() {
		return money;
	}

	public Test3(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
	public void studentStatus(Test4 t4, int passenger) {
		//passenger += passenger;
		t4.pass(passenger);
	}

	public String getName() {
		return name;
	}
	
}
