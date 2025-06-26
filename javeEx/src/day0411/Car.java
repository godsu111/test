package day0411;

public class Car {
	// 변수 : 4개의 타이어 
	
	
	Tire frontLeft = new Tire("앞왼쪽", 6);  // 위치 , 수명
	Tire frontRight = new Tire("앞오른쪽", 2);
	Tire backLeft = new Tire("뒤왼쪽", 3);
	Tire backRight = new Tire("뒤오른쪽", 4);
	
	// 메서드 : 자동차 달림 - > 모든 타이어 1회전 시키는 메서드 
	int run() {
		System.out.println("[자동차가 달립니다.]");
		// 타이어 펑크 -> stop() 메서드 호출 -> 펑크난 타이어의 위치(숫자)를 리턴
		if( frontLeft.roll() 	== false ) {stop(); return 1;}
		if( frontRight.roll() 	== false ) {stop(); return 2;}
		if( backLeft.roll() 	== false ) {stop(); return 3;}
		if( backRight.roll() 	== false ) {stop(); return 4;}
		return 0;
	}
	
	void stop() {	// 타이어 펑크 -> 차 멈추게 하는 메서드
		System.out.println("[자동차가 멈춥니다.]");
	}
}
