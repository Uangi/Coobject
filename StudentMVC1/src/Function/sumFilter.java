package Function;

import java.util.stream.IntStream;

public class sumFilter {

	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      System.out.println(
	               IntStream.range(0, 1001)
	               .skip(500)
	               .filter(i-> i%2==0)
	               .filter(i-> i%5==0)
	               .sum()
	   );
	  }
}

