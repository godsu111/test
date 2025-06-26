package day0411;
/*
	자동 타입 변환 이후 접근 가능한 것.
		조상 타입의 변수는 조상 클래스에 정의된 멤버(변수, 메서드)만 접근 가능.
		자식 클래스에만 있는 멤버에는 사용 불가.
		이때, 오버라이딩 된 메서드가 호출 된다.
*/
class Parent{ // 조상 
	void method1() {
		System.out.println("Parent-method1()");
	}
	void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent{ // 자손
	@Override // 어노테이션
	void method2() {	// 메소드 오버라이딩
		System.out.println("Child-method2()");
	}
	void method3() {
		System.out.println("Child-method3()");
	}
}


public class MainEx02 {
	public static void main(String[] args) {
		// 자손의 객체 생성
		Child child = new Child();
		
		Parent parent = child; // 자동 타입 변환( 자식 - > 부모 )
		parent.method1();
		parent.method2();	// 오버라이딩 된 메서드가 호출된다.
//		parent.method3();	Parent 타입에 method3() 없음 
	}
}






