package day0408;

public class Car2 {
	// 인스턴스 변수
	int speed;
	
	// 인스턴스 메서드
	int getSpeed() {
		return speed;
	}
	
	void turnOn() {
		System.out.println("부릉부릉");
	}
	
	void run() {
		for(int i=10; i<=100; i+=10) {
			speed = i;
			System.out.println("달리는중 ... (시속 : "+speed+" km/h)");
		}
	}
}











