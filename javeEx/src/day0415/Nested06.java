package day0415;

public class Nested06 {
	void method(int param) {	// 메서드의 매개변수 선언
		int local = 100;	// 지역 변수
		
		class Inner {	// 지역 클래스 
			void info() {
				// 외부의 지역 변수에 접근 가능(수정 불가)
				System.out.println("param : "+param);	// 매개변수 접근
				System.out.println("local : "+local);	// 지역변수 접근
			}
		}
		Inner inner = new Inner();
		inner.info();
	}
	
	
	
	public static void main(String[] args) {
		Nested06 n = new Nested06();
		n.method(60);
	}
}
