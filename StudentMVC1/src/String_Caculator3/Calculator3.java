package String_Caculator3;

import String_Calculator2.numberInput;

public class Calculator3 {

	public double result;
	
	public double calcu(double num1, double num2, String op) {
		switch(op) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;
		case "/":
			return num1 / num2;
		default :
			System.out.println("오류");
		}
		return 0;
	}
		public double numPush2(strGap spl) {
			result = calcu(spl.number.get(0),spl.number.get(1),spl.operator.get(0));
			result = calcu(result, spl.number.get(2),spl.operator.get(1));
			return result = calcu(result, spl.number.get(3),spl.operator.get(2));
		}
		
		public double getResult() {
			return result;
		}
		public void calcu() {
		}

}
