package day0415;

abstract class Animal {
	// 추상 메서드 
	public abstract void sound();
	
	// 공통/일반 메서드
	void info() {
		System.out.println("동물입니다.");
	}
}



public class MainEx02 {
	public static void main(String[] args) {
		// 익명 객체 구현
		Animal dog = new Animal() {
			// 추상 메서드 구현
			public void sound() {
				System.out.println("멍멍");
			}
		};
		Animal cat = new Animal() {
			// 추상 메서드 구현
			public void sound() {
				System.out.println("야옹");
			}
		};
		// 사용
		dog.sound();
		dog.info();
		
		cat.sound();
		cat.info();
	}
}