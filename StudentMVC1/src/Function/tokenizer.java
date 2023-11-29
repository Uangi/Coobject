package Function;

import java.util.StringTokenizer;

public class tokenizer {

public static void main(String[] args) {
		
		toCharArray();
		String str1 = "Java Programming Language";
        StringTokenizer tokenizer1 = new StringTokenizer(str1);

        while (tokenizer1.hasMoreTokens()) {
            System.out.println(tokenizer1.nextToken());
        }

        // 문자열을 쉼표를 기준으로 나누기
        String str2 = "Apple,Orange,Banana";
        StringTokenizer tokenizer2 = new StringTokenizer(str2, ",");

        while (tokenizer2.hasMoreTokens()) {
            System.out.println(tokenizer2.nextToken());
            
        }
	}

	private static void toCharArray() {
		String str = "Hello";
		char[] charArray = str.toCharArray();

		for (char c : charArray) {
		    System.out.println(c);
		}
 }
}
