package Abstract;

public class mainController {

	public static void run() { 
		AccountService ac = new Account();	// 인터페이스|객체 = new 피상속 클래스
		ToyShop ts = new ToyShop();
		Input ip = new Input();
		buyControl bc = new buyControl();
		ac.deposit();
//		ip.choiceToy();
		bc.buyToy();
//		ip.nowBalance(ac);
		}	
	}
//		System.out.println("잔액은 : " + ((Account) ac).getBalance());
		/* ac.getBalance가 안되고 클래스 형변환하는 이유 ★
		 * 첫 줄에 Account의 객체(ac)가 인터페이스 타입으로 선언되었다.
		 * 사용방법
		 * (1) . AccountService 라는 인터페이스에 getBalance가 선언되었다면 사용
		 * 하지만 메소드 내부에서 return 값 반환 -> 인터페이스 내부에 사용되지않아서 사용할 수 없다
		 * (2) . Account 클래스를 인스턴스화
		 * AccountService ac 가 아닌 Account ac = new Account(); 
		 * (3) . 클래스 형변환 할때는 (Product) product가 아닌 ((Product) product). 로 
		 * 괄호로 한번 더 묶어서 표현해야한다.
		 * .*/
		
//		ProductService product1 = new Product();
//		ProductService product2 = new Product();
////		((Product) product1).setStock(10);
////		((Product) product2).setStock(5);
//		
//		OrderService order = new Order();
//		((Order)order).addProduct(product1);
//		((Order)order).addProduct(product2);
//		order.createOrder();
		
//		((Product) product1).setStock(0);
//		((Product) product2).setStock(0);
//	}
//}
