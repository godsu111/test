package day0414;
/*
	추상화 
		객체의 공통된 특성을 뽑아내어 공통의 틀로 정의하는 것.
	
	목적
		코드의 유지보수성 향상
		코드의 재사용성 증가 
		구현과 설계를 분리 할 수 있음 -> 협업 용이
	
	사용 
		1. abstract class{}
		2. abstract 메서드
		3. 자손 클래스에서 구체적인 완성이 필요함 
*/

abstract class Phone {
	// 변수
	String user;	// 사용자
	
	// 생성자
	Phone(String user){
		this.user = user;
	}
	
	// 메서드
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

class SmartPhone extends Phone{
	// 생성자
	SmartPhone(String user){
		super(user);	// 추상 클래스인 조상의 생성자 호출
	}
	
	// 자손의 메서드
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
public class MainEx02 {
	public static void main(String[] args) {
		// 다형성 
		Phone p1 = new SmartPhone("이경훈");
		p1.turnOn();
		p1.turnOff();
		
		// 강제 타입 변환 
		SmartPhone s1 = (SmartPhone)p1;
		s1.turnOn();
		s1.internetSearch();
		s1.turnOff();
		
	}
}
