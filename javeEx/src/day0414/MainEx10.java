package day0414;
/*
	인터페이스 상속
		인터페이스 간에도 상속 가능 
		클래스의 상속은 1:1
		인터페이스는 여러개 동시에 상속 가능 
		상속 받는 인터페이스는 상위 인터페이스들의 추상 메서드를 모두 가지게 됨

*/
public class MainEx10 {
	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		// 상위 인터페이스 타입으로 대입 가능 : 다형성
		X xInter = mClass;
		xInter.x();	// X 자신의 타입 메서드만 접근 가능!
		
		Y yInter = mClass;
		yInter.y();
		
		// 구현 인터페이스 타입으로 대입가능 
		// MyInterface 인터페이스가 상속한 모든 메서드에 접근 가능 
		MyInterface mInter = mClass;
		mInter.x();
		mInter.y();
		mInter.myMethod();
	}
}
