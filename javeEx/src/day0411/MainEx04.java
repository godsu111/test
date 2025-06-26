package day0411;
/*
	자동 타입 변환
		자식 객체가 부모 타입 변수에 대입될 때
		변수에 값을 대입, 
		메서를 호출할 때 자주 사용
		
	메서드를 호출 할때
		반드시 매개변수의 타입에 맞는 값을 넣어야 함
*/
class Vehicle{	// 조상
	void run() {
		System.out.println("이동수단이 달립니다.");
	}
}
class Taxi extends Vehicle{		// 조상의 타입에 자손의 객체가 대입
	void run() {
		System.out.println("택시가 달립니다.");
	}
}
class Bus extends Vehicle{
	void run() {
		System.out.println("버스가 달립니다.");
	}
}
class Driver{
	void drive(Vehicle vehicle) {	// void msg(String msg){}
		vehicle.run();
	}
}

public class MainEx04 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		// Vehicle vehicle = bus;
		driver.drive(bus);	// bus 객체가 가지고 있는 오버라이딩 한 run() 메서드 호출
		// Vehicle vehicle = taxi;
		driver.drive(taxi); // taxi 객체가 가지고 있는 오버라이딩 한 rub() 메서드 호출 
		
	}
}
