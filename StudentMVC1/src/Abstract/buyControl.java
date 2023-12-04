package Abstract;

import java.util.Iterator;

public class buyControl {
	
	
	AccountService ac = new Account();	// 잔액
	ToyShop ts = new ToyShop();	// 장난감
	Input ip = new Input();			// 입출력
	
	public String T;	// 장난감 선택
	
	public void buyToy() {
		
			T = ip.choiceToy();
			if( T.equals("A")) {
//				ts.apeachToy();	// static 을 쓰려면 인터페이스 X
				ts.apeachToy();  // apeachToy()의 반환값을 저장
	            ip.nowBalance(ac);  // 업데이트된 잔액을 출력
	            ip.buyAfterBalance(ts);
			}
			else if(T == "B") {
				ts.bearToy();
			}
			else if(T == "L") {
				ts.LionToy();
			}
			else {
				ip.notEnough();
			}
		}
}
