package day0414;

public class Cat extends Animal{
	// 생성자
	Cat(){
		this.kind="포유류";
	}
	
	// 추상 메서드 구현!
	void sound() {
		System.out.println("야옹~");
	}
}
