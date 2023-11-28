package String_Caculator3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// 문자열 계산 split, replaceAll
public class main {

	public static void main(String[] args) throws IOException {

		strGap spl = new strGap();
		Calculator3 cc = new Calculator3();
		spl.split();
		cc.numPush2(spl);
		cc.calcu();
		System.out.println("결과 :  " + cc.result);
		
	}

	
}
