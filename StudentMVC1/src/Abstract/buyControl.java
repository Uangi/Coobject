package Abstract;

import java.util.Iterator;

public class buyControl {
	
	
	AccountService ac = new Account();	// 잔액
	ToyShop ts = new ToyShop();	// 장난감
	Input ip = new Input();			// 입출력
	
	public String T;	// 장난감 선택
	
	public void buyToy() {
		
			T = ip.choiceToy();
			if( T.equals("a")) {
				// static 을 쓰려면 인터페이스 X
				ts.newbalance = ts.apeachToy();  // apeachToy()의 반환값을 저장
				ac.setBalance(ts.newbalance);     // 업데이트된 잔액으로 설정
				ip.nowBalance(ac);
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
