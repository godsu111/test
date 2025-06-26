// Animal, Dog, Cat 클래스 참조
package day0414;
/*
	추상 메서드 
		abstract	키워드 
		메서드의 선언부만 (); 정의	-> {구현부} 없음
		추상 클래스 내에서만 선언 가능 
		상속 받은 자손 클래스에서 반드시 오버라이딩(재정의) 해야함
		
		
*/
public class MainEx03 {
	public static void main(String[] args) {
		// 다형성
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		// 강제 타입 변환
		Cat c = (Cat)a1;
		Dog d = (Dog)a2;
		
		a1.breathe();
		a1.sound();
		
		a2.breathe();
		a2.sound();
		
		c.breathe();
		c.sound();
		
		d.breathe();
		d.sound();
		
		// 변수의 자동 타입 변환
		Animal a = null;
		a = new Cat();
		a.sound();
		a = new Dog();
		a.sound();
		System.out.println("====================");
		// 매개변수의 자동 타입 변환
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
