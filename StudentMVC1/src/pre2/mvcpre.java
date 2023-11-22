package pre;

import java.util.Scanner;

public class mvcpre {

	public class mvc {
		

		// Model 클래스
		class CalculatorModel {
		    private double operand1;
		    private double operand2;
		    private double result; 

		    public double getOperand1() {
		        return operand1;
		    }

		    public void setOperand1(double operand1) {
		        this.operand1 = operand1;
		    }

		    public double getOperand2() {
		        return operand2;
		    }

		    public void setOperand2(double operand2) {
		        this.operand2 = operand2;
		    }

		    public double getResult() {
		        return result;
		    }


		    // 계산 로직
		    public void add() {
		        result = operand1 + operand2;
		    }

		    public void subtract() {
		        result = operand1 - operand2;
		    }

		    public void multiply() {
		        result = operand1 * operand2;
		    }

		    public void divide() {
		        if (operand2 != 0) {
		            result = operand1 / operand2;
		        } else {
		            System.out.println("나눗셈의 분모는 0이 될 수 없습니다.");
		        }
		    }
		}

		// View 클래스
		class CalculatorView {
		    public void displayResult(double result) {
		        System.out.println("계산 결과: " + result);
		    }
		}

		// Controller 클래스
		class CalculatorController {
		    private CalculatorModel model;
		    private CalculatorView view;

		    public CalculatorController(CalculatorModel model, CalculatorView view) {
		        this.model = model;
		        this.view = view;
		    }

		    public void setOperand1(double operand1) {
		        model.setOperand1(operand1);
		    }

		    public void setOperand2(double operand2) {
		        model.setOperand2(operand2);
		    }

		    public void performAddition() {
		        model.add();
		        view.displayResult(model.getResult());
		    }

		    public void performSubtraction() {
		        model.subtract();
		        view.displayResult(model.getResult());
		    }

		    public void performMultiplication() {
		        model.multiply();
		        view.displayResult(model.getResult());
		    }

		    public void performDivision() {
		        model.divide();
		        view.displayResult(model.getResult());
		    }
		    
		}

		// Main 클래스
		public class CalculatorMVC {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        CalculatorModel model = new CalculatorModel();
		        CalculatorView view = new CalculatorView();
		        CalculatorController controller = new CalculatorController(model, view);

		        System.out.print("첫 번째 숫자를 입력하세요: ");
		        double operand1 = scanner.nextDouble();
		        controller.setOperand1(operand1);

		        System.out.print("두 번째 숫자를 입력하세요: ");
		        double operand2 = scanner.nextDouble();
		        controller.setOperand2(operand2);

		        System.out.println("1. 덧셈  2. 뺄셈  3. 곱셈  4. 나눗셈");
		        System.out.print("원하는 연산을 선택하세요: ");
		        int choice = scanner.nextInt();

		        switch (choice) {
		            case 1:
		                controller.performAddition();
		                break;
		            case 2:
		                controller.performSubtraction();
		                break;
		            case 3:
		                controller.performMultiplication();
		                break;
		            case 4:
		                controller.performDivision();
		                break;
		            default:
		                System.out.println("잘못된 선택입니다.");
		        }

		        scanner.close();
		    }
		}
	}

}
