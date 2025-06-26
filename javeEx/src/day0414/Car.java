package day0414;

public abstract class Car {
	// 추상 메서드 
	abstract void drive();
	abstract void stop();
	
	// 구현 메서드
	void startCar() {
		System.out.println("시동을 겁니다.");
	}
	void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
