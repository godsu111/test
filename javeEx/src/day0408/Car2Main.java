package day0408;

public class Car2Main {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 변수명 = new 클래스명();
		Car2 c1 = new Car2();
		
		// 1. 시동켜기
		c1.turnOn();
		
		// 2. 달리기
		c1.run();
		
		// 3. speed 값 꺼내기
		int speed= c1.getSpeed();
		System.out.println(speed);
	}
}
