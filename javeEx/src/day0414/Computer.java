package day0414;

public abstract class Computer {
	// 자손 클래스들이 공통으로 가질 메서드
	abstract void display();
	abstract void typing();
	
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
