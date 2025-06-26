package day0414;
/*
	인터페이스(Interface)
		객체의 사용방법(규칙)을 정의해놓은 설계도.
		상태(데이터)를 저장하지 않고 기능만 정의(인스턴스 / static 변수 사용 X)
		유지보수, 확장성 
		인터페이스를 구현한 객체에 따라 실행 내용이 달라진다.
			-> 다형성 
			
	구성 요소(4가지)
		상수 변수		public static final 특성 (생략  가능)
					초기값 필요
		추상 메서드		public abstract 특성 (생략 가능)  
					메서드 정의 O, 구현 X
     	디플트 메서드	default 키워드 사용
     	 			인스턴스 메서드처럼 사용 가능 : 구현한 실체 클래스에서 사용
		정적 메서드 	static 키워드 사용
					객체 생성 없이 사용 가능	: 인터페이스명.메서드();
					
	없어야 하는것 
		인스턴스 변수 X		-> 반드시 초기값 필요
		static 변수 X
		생성자 정의 X

*/
public class MainEx06 {
	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc;
		RemoteControl rc2;
		
		// 대입 가능 -> 다형성
		rc = new Television();
		rc2 = new Audio();
	
		rc.turnOn();
		rc.setVolume(-10);
		
		rc2.setVolume(100);
		rc2.turnOff();
		
	}
}
