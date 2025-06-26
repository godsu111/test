package day0414;

public abstract class Animal {
	// 변수
	String kind;
	
	// 메서드
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	// 구현부 {} 없음
	abstract void sound(); 
}
