package Abstract;


abstract class Animal {
	
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
        System.out.println("소리 만들기");
    }
    
    public void dogdog() {
    	System.out.println("독독");
	}
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("야옹");
	}
	
	public void dogdog() {
		System.out.println("캣캣");
	}
}

public class Abstract1 {
	public static void main(String[] args) {
		
		Animal myDog = new Dog();
		myDog.makeSound();
		myDog.dogdog();	// Dog 클래스의 객체지만 Animal 클래스에 접근하는법
		Animal myCat = new Cat();
		myCat.dogdog();
		myCat.makeSound();
//		Animal ani = new Animal();	// 추상 클래스라 객체로 사용하지못함.
//		ani.makeSound();
//		ani.dogdog();
	}
	
}
