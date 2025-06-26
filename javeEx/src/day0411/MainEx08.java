package day0411;
/*
	instanceof	연산자
		객체가 어떤 클래스의 인스턴스인지 확인할 때 사용
		
	사용 시기
		강제 타입변환을 하려고 할 때
		-> 그 타입으로 변환이 가능한지 아닌지 확인 필요!
		
	사용 방법
		객체 instanceof 클래스명 
		결과 true(객체가 클래스 타입이다.) / false(객체가 클래스 타입이 아니다.) 
	
	사용 주의
		자동 타입 변환 상태이어야 함
		부모 타입 변수가 부모 타입 객체를 참조 할 경우 자식 타입으로 변환 불가능. ex) Parent p = new Parent();
		 
		
*/
class Parent3 {}
class Child3 extends Parent3 {}


public class MainEx08 {
	
	// 안전하게 instanceof 연산자로 확인 후 강제 타입 변환
	public static void method1(Parent3 p3) {
		if( p3 instanceof Child3 ) {
			Child3 c3 = (Child3)p3;
			System.out.println("method1 - child3로 변환 성공");
		}
		else {
			System.out.println("method1 - child3로 변환 실패");
		}
	}
	
	// 무작정 강제 타입 변환 시도
	public static void method2(Parent3 p3) {
		Child3 c = (Child3)p3;
		System.out.println("method2 - Child3로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent3 p1 = new Child3(); // 부모타입에 자손 객체 대입 
		method1(p1);
		method2(p1);
		
		System.out.println("=========================");
		Parent3 p2 = new Parent3();
		method1(p2);
//		method2(p2);
		
	}
}

