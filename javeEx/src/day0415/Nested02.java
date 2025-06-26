package day0415;

class AA {	// 외부 클래스 AA
	// 정적 변수
	static int num = 100;
	// 정적 메서드
	static void methodAA() {
		System.out.println("num = "+num);
	}
	// 정적 멤버 클래스
	static class BB{
		static int x = 500;
		int y = 700;	// 인스턴스 변수(객체 생성 필요)
	}
}


public class Nested02 {
	public static void main(String[] args) {
		// 외부 클래스의 정적 멤버(변수, 메서드) 사용
		System.out.println(AA.num);
		AA.methodAA();
		
		// 정적 멤버 클래스의 정적 변수 사용	- 객체 생성 없이 사용
		System.out.println(AA.BB.x);
		
		// 정적 멤버 클래스의 인스턴스 변수 사용  - 객체 생성 후 사용 가능
		AA.BB b = new AA.BB();
		System.out.println(b.y);
	}
}
