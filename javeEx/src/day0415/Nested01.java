package day0415;

/*
	인스턴스 멤버 클래스	: 외부 클래스의 객체가 있어야 사용 가능	- a.new B();
	정적 멤버 클래스 	: 외부 클래스의 객체 생성 없이 사용 가능	- new A.C();
	지역 클래스			: 메서드 내부에 선언이 되어야함, 메서드 안에서만 사용 가능 
*/
class A { // 외부 클래스
	// 1. 인스턴스 멤버 클래스
	class B{
		void methodB(){
			System.out.println("인스턴스 멤버 클래스 B");
		}
	}
	// 2. 정적 멤버 클래스
	static class C{
		void methodC() {
			System.out.println("정적 멤버 클래스 C");
		}
	}
	// 외부 클래스 A의 메서드
	void methodA() {
		class D{	// 지역 클래스 D
			void methodD() {
				System.out.println("지역 클래스 D");
			}
		}
		D d = new D();
		d.methodD();
	}
}
public class Nested01 {
	public static void main(String[] args) {
		// 외부 클래스 A의 객체 생성
		A a = new A();
		
		// 1. 인스턴스 멤버 클래스 B
		A.B b = a.new B();	// 바깥 외부 클래스 생성 후 안쪽 객체 생성
		b.methodB();
		
		// 2. 정적 멤버 클래스 C
		A.C c = new A.C(); // 바깥 객체 생성 X
		c.methodC();
		
		// 3. 지역 클래스 D 사용
		a.methodA(); // 메서드 안에서 지역 클래스 D가 실행
	}
}
