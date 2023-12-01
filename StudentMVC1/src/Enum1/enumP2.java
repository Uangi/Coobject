package Enum1;

public enum enumP2 {

	APEACH("어피치"), BEAR("곰"), LION("라이언");
	
	private String description;
	
	enumP2(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	

public static void main(String[] args) {
	
	enumP2 myEnum = enumP2.APEACH;
	System.out.println(myEnum.getDescription());
	
	System.out.println("모든 인형 : ");
	for(enumP2 doll : enumP2.values()) {
		System.out.println(doll.getDescription());
	}	
}
}
