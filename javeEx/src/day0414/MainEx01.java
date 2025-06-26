package day0414;
/*
	추상(abstract)
		삼성, LG, KIA		-> 회사 
		
	클래스의 추상화
		추상 클래스 : 여러 클래스들의 공통된 속성과 기능을 가지는 클래스
		단독 객체 생성 불가 : new 사용이 불가하다
		자손 클래스에서 객체 생성해야함
		
	추상 클래스의 특징 
		선언	방법		public abstract class 클래스명{ }
		객체 	생성 		직접 생성 불가 -> new 사용불가
		자손 클래스		extends로 상속받아서 사용
		생성자		자손에서 super(); 호출하여 사용
		사용 목적		코드의 공통 기능을 정리, 재사용하기 위함
*/

abstract class A {
	// 추상 메서드
	// abstract 리턴타입 메서드명(매개변수);		{ 구현 코드 } 없음
	abstract void methodA();
}

// 클래스 B가 A를 상속받아 methodA를 반드시 구현해야한다.
class B extends A {
	@Override
	void methodA() {
		System.out.println("B가 구현부 오버라이딩");
	}
}
class C extends A {
	void methodA() {
		System.out.println("C가 구현부 오버라이딩");
	}
}


public class MainEx01 {
	public static void main(String[] args) {
		A a1 = new B(); // 다형성
		A a2 = new C();
		
		// 각각의 자손이 오버라이딩 한 메서드 호출
		a1.methodA();
		a2.methodA();
	}
}
