package day0411;

public class Car22 {
	Tire[] tires = {
			new Tire("앞왼쪽", 5),   // Tire[0]
			new Tire("앞오른쪽", 10), // Tire[1]
			new Tire("뒤왼쪽", 3),    // Tire[2]
			new Tire("뒤오른쪽", 7)    // Tire[3]
	};
	
	// 메서드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		
		for(Tire a : tires) { // foreach문(타입 변수명 : 반복대상)
			if(a.roll() == false) {
				stop();
				return 0;
			}
		
		}
		return 0;
	}
	void stop() {System.out.println("자동차가 멈춥니다.");}
}
