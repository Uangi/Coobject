package Function;

public class WidthMulti {
	public void main(String[] args) {
	for(int i = 1; i < 10; i++) {
		System.out.print(i + "단" + "                       ");
	}	// 1x1 2x1 3x1 4x1
		// 1x2 2x2 3x2 4x2
	System.out.println("");

	for(int i = 1; i < 10; i++) {
		for(int j = 1; j < 10; j++) {
			System.out.print(j + "x"+ i + "=" + i*j +"        ");
			if(j == 9) {
				System.out.println("");
			}
	}
	
	}
	for(int k = 1; k < 10; k++) {
	System.out.println("");
		}
	}
}


