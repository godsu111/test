package day0409;
/*
	싱글톤 패턴
		- 인스턴스(객체)를 단 하나만 생성하는 디자인 패턴
		- 공통으로 사용하는 설정, 데이터베이스 연결 객체 등에 사용
	싱글톤 만들기 
		1. 생성자를 private 사용하여 접근 막기
			외부에서 new로 객체 생성 못함.
			해당 클래스 안에서만 객체 생성
				private 클래스(){}
				
		2. 자신의 클래스 타입의 정적(static) 변수 생성 	- private 사용
			외부에서 값 변경 불가능 
			해당 클래스 내에서 하나의 객체만 만들어 저장하기 위한 용도로 사용
				private static 클래스타입 instance = new 클래스();
				
		3. 객체를 리턴 할 정적(static) 메서드 선언
			외부에서 이 객체를 사용할 수 있도록 제공하는 역할 
			항상 같은 객체를 리턴한다
				public static 클래스타입 getInstance();{
					if(instance == null){
						instance = new 클래스();
					}
					return instance; // 유일한 인스턴스(객체 리턴)
				}
*/
class Single { // 변수 생성자 메서드
	// 1. 자기 자신 타입의 private static 변수 생성
	private static Single instance = new Single(); 
	// 2. private
	private Single() {}
	// 3. 외부에서 객체를 꺼내는 매서드
	public static Single getInstance() {
		return instance;
	}
}

public class Singletone01 {
	public static void main(String[] args) {
		// 정적 메서드사용 -> 클래스명.메서드명();
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		
		// 같은 객체를 참조하는 지 확인
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);  // 참조변수가 가진 값은 객체의 주소
	}
}








