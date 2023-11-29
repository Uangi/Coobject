package Extends;


class Animal {
    void makeSound() {
    	System.out.println("좋은 소리");
	}
    public void dogdog() {
    	System.out.println("dogdog");
    }
}

class Dog extends Animal {
	
    @Override
	void makeSound() {	
    //  부모클래스에서 사용한 메소드를 덮어씌워서 사용
        System.out.println("Bark");
    }
    public void dogdog() {
    	System.out.println("catcat");
	}
}

public class extends1 {
	
	public static void main(String[] args) {
		
		Animal myDog = new Dog();
		myDog.makeSound();
		myDog.dogdog();	// Dog 클래스의 객체지만 Animal 클래스에 접근하는법
	}
	
}
