package day0411;

public class HankookTire extends Tire{ 
	// 생성자
	HankookTire(String location,int maxRotation){
		// 조상의 기본생성자를 사용 할 수 없기 때문에 호출 해줘야함
		super(location, maxRotation); // 조상 생성자 호출!
	}

	// 메서드 
	@Override
	boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location+" HankookTire 수명 : "+(maxRotation - accumulateRotation)+ "회");
			return true;
		}
		else {
			System.out.println("*** "+location+" HankookTire 펑크 ***");
			return false;
		}
	}	
}
