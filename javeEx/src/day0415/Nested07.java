package day0415;

public class Nested07 { // 외부 클래스
	// 외부 클래스의 인스턴스 변수 
	String name = "외부 클래스";
	
	// 인스턴스 멤버 클래스
	class Inner {
		// 내부 클래스의 인스턴스 변수
		String name = "내부 클래스";
		
		void info() {
			System.out.println("내부 name : "+name);	// 내부 클래스의 name
			System.out.println("외부 name : "+Nested07.this.name);	// 외부 클래스의 name
		}
	}
	public static void main(String[] args) {
		// 외부 객체 생성
		Nested07 outer = new Nested07();
		// 내부 클래스 객체 생성
		Nested07.Inner inner = outer.new Inner();
		// 내부 클래스의 메서드 호출
		inner.info();
	}
}
