package Extends;


class Animal2 {
    void makeSound() {
    	System.out.println("좋은 소리");
	}
    public void dogdog() {
    	System.out.println("dogdog");
    }
}

class Dog2 extends Animal {
	
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
    public void dogdog() {
    	System.out.println("catcat");
	}
}

class Cat2 extends Animal {
	@Override
	void makeSound() {
		System.out.println("야옹");
	}
	
	public void dogdog() {
		System.out.println("캣캣");
	}
}
public class extends2 {
	
	public static void main(String[] args) {
		
		Animal2 myDog2 = new Animal2();
		myDog2.makeSound();	// 
		myDog2.dogdog();	// 
		Animal2 myCat2 = new Animal2();
		myCat2.dogdog();
		myCat2.makeSound();
		Animal2 ani2 = new Animal2();	//
		ani2.makeSound();
		ani2.dogdog();
	}
	
}
