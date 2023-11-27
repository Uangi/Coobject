package String_Caculator3;

import String_Calculator2.numberInput;

public class Calculator {

	public double result;
	public double Calcu(double n1, double n2, strSplit sp) {
		
		if(sp.str.equals("+")) {
			return n1 + n2;
		}
		else if(sp.str.equals("-")) {
			return n1 - n2;
		}
		else if(sp.str.equals("*")) {
			return n1 * n2;
		}
		else if(sp.str.equals("/")) {
			return n1 / n2;
		}
		else { 
			System.out.println("올바르지 않은 문자입니다.");
		}
		return 0;
		
		public void numPush(strSplit split) {
			result = Calcu(ip.number.get(0),ip.number.get(1),ip.operator.get(0));
			result = Calcu(result, ip.number.get(2),ip.operator.get(1));
			result = Calcu(result, ip.number.get(3),ip.operator.get(2));
		}
	}
	
	public double getResult() {
		return result;
	}
}
