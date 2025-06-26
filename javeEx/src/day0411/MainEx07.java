package day0411;
/*
	강제 타입 변환(casting <-> promotion: 자동 타입 변환)
		조상 타입으로 자동 변환된 객체를 다시 자손 타입으로 되돌리는 것
		
	자동 타입 변환
		자손 객체 -> 조상 타입 대입 : Parent2 p = new Child(); 
		이때 조상이 가진 변수와 메서드만 접근이 가능하다.
		
	 강제 타입 변환
	 	자손 객체 -> 조상 타입 대입 -> 자손 타입 대입 : Child c = (Child)p;
	 	이때 자손의 변수, 메서드에 접근 가능
	 	
 	주의!
 		변환이 무조건 가능한 것은 아님
 		부모 타입 변수에 담긴 자손을 다시 자손 타입으로 되돌려야함.
 		ClassCastException 오류가 발생할 수 있음!
*/

class Parent2{	// 조상
	// 변수
	String var1;
	
	// 메서드
	void method1() {
		System.out.println("Parent-method1()");
	}
	void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child2 extends Parent2{ // 자손
	// 자손의 변수
	String var2;
	
	// 자손의 메서드
	void method3() { 
		System.out.println("Child-method3()");
	}
}


public class MainEx07 {
	public static void main(String[] args) {
		// 1. 자동 타입 변환 : 자식 -> 부모
		// 조상의 타입에 자손의 객체가 대입된다.
		Parent2 p2 = new Child2();
		p2.var1 = "data1";
//		p2.var2 = "data2";  자손만의 것이기때문에 조상이 접근 할 수 없음.
		p2.method1();
		p2.method2();
//		p2.method3();	
		
		// 2. 강제 타입 변환 : 부모 -> 자식, 자동 타입 변환된 조상의 변수만 대입가능
		Child2 c1 = (Child2)p2;
		
		// 자손 타입의 멤버에 접근이 가능하다 
		c1.var2 = "data3";
		c1.method3();
/*		불가능 : 코드에 문제 없어 보이나 실행 예외 발생
  		Parent3 p = new Parent3();
		Child3 c = (Child3)p;
*/
//		Child2 c3 = new Parent2();	강제타입변환 불가능, 자동 타입변환이 된 조상의 변수만 대입가능하기 때문
		// 올바른 방법
		Parent2 p3 = new Child2();
		Child2 c3 = (Child2)p3;
	}
}





