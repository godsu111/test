package day0411;
// 같은 타입의 값을 저장 = 배열 
public class Car2 {
	// 타입 [] 변수명 = new 타입[방개수]();
	Tire[] tires = {
			new Tire("앞왼쪽", 6), 
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
	};
	
	// 메서드 
	int run() {
		System.out.println("[자동차가 달립니다.]");
		
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false ) {
				stop();
				return i+1;
			}
		}
		return 0;
	}
	void stop() {System.out.println("자동차가 멈춥니다.");}
}
