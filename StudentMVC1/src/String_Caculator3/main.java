package String_Caculator3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		strSplit spl = new strSplit();
		Calculator cc = new Calculator();
		spl.split();
		//spl.isNumber();
		cc.Calcu(spl);
		
	}
}
