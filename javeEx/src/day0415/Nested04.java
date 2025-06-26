package day0415;

class X {	// 외부 클래스 
	void methodX() {	// 외부 클래스의 메서드 안에서만 존재
		class Y {	// 지역 클래스
			int a = 100;
			void methodY() {
				System.out.println("지역 클래스 Y의 methodY() 실행, a : "+a);
			}
		}
		Y y = new Y();
		y.methodY();
	}
}

public class Nested04 {
	public static void main(String[] args) {
		// 외부 클래스의 객체 생성
		X x = new X();
		x.methodX();	// 지역 클래스가 정의된 메서드 호출 
	}
}
