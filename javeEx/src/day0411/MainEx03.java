package day0411;

class Animal {	// 조상
	void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}
}

class Dog extends Animal{	 // 자손
	void sound() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal{  // 자손
	void sound() {
		System.out.println("야옹~");
	}
}
class Bird extends Animal{  // 자손
	void sound() {
		System.out.println("짹짹!");
	}
}

public class MainEx03 {
	public static void main(String[] args) {
		// 하나의 Animal 타입으로 다양한 동물 사용( 다형성 ) 
		// 자동 타입 변환 후 메서드 호출
		Animal animal = new Dog();
		Animal animal1 = new Cat();
		Animal animal2 = new Bird();
		
		// 같은 타입 이지만 실행 결과가 다르다. 
		animal.sound();
		animal1.sound();
		animal2.sound();
		
		
	}
}






