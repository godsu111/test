package day0411;

public class KumhoTire extends Tire {
	// 생성자
	KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	// 메서드 오버라이딩 - 구현부만 다르게....
	boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location+" KumhoTire 수명 : "+(maxRotation - accumulateRotation)+" 회");
			return true;
		}
		else {
			System.out.println("*** "+location+" KumhoTire 펑크 ***");
			return false;
		}
	}
}