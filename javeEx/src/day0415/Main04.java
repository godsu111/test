package day0415;
// ClassCastException	: 타입 캐스팅 시 예외

class Vehicle {}
class Bus extends Vehicle {}
class Taxi extends Vehicle {}

public class Main04 {
	public static void main(String[] args) {
		Vehicle a = new Bus();
		
		if( a instanceof Taxi ) {
			Taxi taxi = (Taxi)a;
			System.out.println("타입 변환 성공");
		}
		else {	// 예외 예방 처리
			System.out.println("타입 변환 실패");
		}
	}
}
