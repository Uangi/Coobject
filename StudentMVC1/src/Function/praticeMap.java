package Function;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class praticeMap {

	private static final Map<String, Integer> hashMap = new HashMap<>();
    private String name;
    private int grade;
    
	public static void main(String[] args) {
		//rivate final int MONEY = 10000;

	   // public void getMONEY() {
	    	//System.out.println("처음 돈");

	    	Scanner sc = new Scanner(System.in);
	    	Map<String, Integer> hashMap = new HashMap<>();
	    	
	    	System.out.println("이름을 입력하세요 : ");
	    	String name = sc.nextLine();

	    	System.out.println("학년을 입력하세요 : ");
	    	int grade = sc.nextInt();
	    	
	    	hashMap.put(name, grade);
	    	
	    	System.out.println("탑승목록\n " + hashMapToString(hashMap));
	    	
	    }

	private static String hashMapToString(Map<String, Integer> hashMap) {
		StringBuilder result = new StringBuilder("이름:");	// {
		
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			result.append(entry.getKey()).append(", ").append(entry.getValue()).append(", ");
		}
		// 마지막에 추가된 ", "를 제거
        if (result.length() > 1) {
            result.setLength(result.length() - 2);
        }

        result.append("학년");	// }

        return result.toString();
    }
}


