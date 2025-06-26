package day0415;

class Outer { // 외부 클래스 
	// 인스턴스 변수
	int a = 10;
	
	// 인스턴스 멤버 클래스
	class Inner {
		void info() {
			System.out.println("외부 값 a에 접근 : "+a);
		}
	}
	// 정적 멤버 클래스
	static class SInner {
		static int b = 100;
		
		void show() {	// 인스턴스 메서드
			System.out.println("정적 내부 클래스");
			System.out.println("정적 변수 b에 접근 : "+b);
		}
	}
}

public class Nested05 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.info();
		
		System.out.println("================");
		
		// 정적 내부 클래스
		Outer.SInner sInner = new Outer.SInner();
		sInner.show();
	}
}






