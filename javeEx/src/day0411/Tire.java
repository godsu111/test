package day0411;
// HankookTire, KumhoTire 자손 => MainEx05에서 실행
public class Tire { // 조상
	// 변수
	int maxRotation;		// 최대 회전 수 (수명)
	int accumulateRotation; // 누적 회전 수 
	String location;		// 타이어의 위치 
	
	// 생성자
	Tire(String location, int maxRotation){// 매개변수가 있는 생성자
		this.location = location;
		this.maxRotation =maxRotation;
	}
	
	// 메서드
	boolean roll() { // 타이어를 1회전 시키는 메서드
		// 누적 회전수를 1증가
		accumulateRotation++;
		
		if(accumulateRotation < maxRotation) { // 누적 < 최대(수명)
			// 어떤 위치의 타이어의 수명이 몇 남았는 지 확인
			System.out.println(location+" Tire 수명 : "+(maxRotation - accumulateRotation)+" 회");
			return true;
		}
		else {	// 누적 >= 최대(수명) 
			// 타이어 펑크
			System.out.println("*** "+location+" Tire 펑크 ***");
			return false;
		}
	}
}
