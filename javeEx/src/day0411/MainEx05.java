package day0411;
// Tire, HankkokTire, KumhoTire 클래스 확인! + Car 
public class MainEx05 {	// 실행 클래스
	public static void main(String[] args) {
		Car car = new Car();
		
		// Car 객체의 run() 메서드 5회 반복
		for(int i=1; i<=5; i++) {
			// 문제가 발생한 타이어 위치
			int problemLocation = car.run();
			// 위치에 해당할 때 타이어 변경
			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeft = new HankookTire("앞왼쪽", 15);
					break;
				case 2:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRight = new KumhoTire("앞오른쪽",13);
					break;
				case 3:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeft = new HankookTire("뒤왼쪽",14);
					break;
				case 4:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.backRight = new KumhoTire("뒤오른쪽",17);
					break;
			}
			System.out.println("===================");
			
		
		}
	}
}
