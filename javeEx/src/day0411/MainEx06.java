package day0411;
// Tire, HankookTire, KumhoTire 클래스 확인! + Car2
public class MainEx06 {
	public static void main(String[] args) {
		Car2 car2 = new Car2();

		for(int i=1; i<6; i++) {
			int problemLocation = car2.run();
			
			if( problemLocation != 0) {
				System.out.println(car2.tires[problemLocation-1].location+" HankookTire로 교체");
				car2.tires[problemLocation-1] = new HankookTire(car2.tires[problemLocation-1].location, 15);
			}
			System.out.println("=========================");
		}
	}
}

// foreach
// for( 타입 : 반복대상){}