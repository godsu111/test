package day0414;
/*
	자바에서의 상속 
		1:1 단일 상속만 가능		: 하나의 조상만 가능
		
	다중 인터페이스 구현 가능 - implements 인터페이스1, 인터페이스2, 인터페이스3, ....
		구현 클래스 
		다수의 인터페이스 타입으로 사용 가능.
		모든 추상 메서드를 반드시 구현!
		abstract를 붙여 추상클래스로 사용 가능
		클래스는 다중 상속이 X, 인터페이스는 다중 구현이 O
		
	public class 구현 클래스 implements 인터페이스 A, 인터페이스 B, .....{
		// 인터페이스 A의 모든 추상 메서드 구현
		// 인터페이스 B의 모든 추상 메서드 구현
	}
*/
public class MainEx08 {
	public static void main(String[] args) {
		// 3개, 다형성
		SmartTelevision st = new SmartTelevision();
		RemoteControl rc = new SmartTelevision();	
		Searchable sc = new SmartTelevision();
	
	}
}
