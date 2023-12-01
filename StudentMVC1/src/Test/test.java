package Test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수식을 입력하세요 : ");
		String str = sc.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(str);
		while(tokenizer.hasMoreTokens()) 
			System.out.print(tokenizer.nextToken() + " ");
		
	}
}

