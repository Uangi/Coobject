package String_Caculator4;

import String_Calculator2.numberInput;

public class Calculator4 {

	public double result;
	public double calcu(double num1, double num2, StringTokenizer spl) {
		// str은 배열
		if(spl.equals("+")) {
			return num1 + num2;
		}
		else if(spl.equals("-")) {
			return num1 - num2;
		}
		else if(spl.equals("*")) {
			return num1 * num2;
		}
		else if(spl.equals("/")) {
			return num1 / num2;
		}
		else { 
			System.out.println("올바르지 않은 문자입니다.");
			return 0;
		}
	}
		public double numPush2(StringTokenizer spl) {
			result = calcu(spl.number.get(0),spl.number.get(1),spl.operator.get(0));
			result = calcu(result, spl.number.get(2),spl.operator.get(1));
			return result = calcu(result, spl.number.get(3),spl.operator.get(2));
//			
//			result = spl.number.get(0);
//			for(int i = 0; i < spl.operator.size(); i++) {
//				result = calcu(result, spl.number.get(i+1),spl.operator.get(i));
//			}
//			return result;
		}
		
		private double calcu(double result2, Double num2, String string) {
			
			return 0;
		}
		public void calcu() {
		}

}
