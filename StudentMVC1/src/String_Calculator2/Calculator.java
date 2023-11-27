package String_Calculator2;

public class Calculator {
	
	public double result;
	public double Calculate(double n1, double n2, String op) {
		
		switch(op) {
		case "+":
			return n1 + n2;
		case "-":
			return n1 - n2;
		case "*":
			return n1 * n2;
		case "/":
			return n1 / n2;
		default :
			System.out.println("오류");
		}
		return 0;
	}
	
	public void numPush(numberInput ip) {
		result = Calculate(ip.number.get(0),ip.number.get(1),ip.operator.get(0));
		result = Calculate(result, ip.number.get(2),ip.operator.get(1));
		result = Calculate(result, ip.number.get(3),ip.operator.get(2));
	}

	public double getResult() {
		return result;
	}

	public void Calculate() {
	}
	
	
}
