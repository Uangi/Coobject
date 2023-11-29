package Function;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPrac {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		Iterator<String> iterator = list.iterator();	// iterator 쓸게 선언
		while(iterator.hasNext()) {	// list에 값이 있다면
			String fruit = iterator.next();	// fruit에 값 넣어주기 
			System.out.println(fruit);
		}
	}
	

	
}
