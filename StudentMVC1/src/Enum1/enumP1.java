package Enum1;

public class enumP1 {
	
public enum Color {
	RED, GREEN, BLUE, BLACK;
}
	public static void main(String[] args) {

		Color myColor = Color.RED;
		
		switch(myColor) {
		case RED :
			System.out.println("빨강");
			break;
		case GREEN :
			System.out.println("초록");
			break;
		case BLUE :
			System.out.println("파랑");
			break;
		case BLACK :
			System.out.println("검정");
			break;
	}

		System.out.println("모든 색 : ");
		for(Color color : Color.values()) {
			System.out.println(color);
		}
	}
}
