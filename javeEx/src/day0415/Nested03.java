package day0415;

class AAA{	// 외부 클래스
	// 인스턴스 변수
	int a = 100;
	
	// 인스턴스 멤버 클래스
	class BBB{
		// static final 만 가능 
		static final int x = 300;
		// 인스턴스 변수  
		int y = 500;
	}
}

public class Nested03 {
	public static void main(String[] args) {
		// 외부 클래스 객체 생성
		AAA aaa = new AAA();
		// 내부 클래스 객체 생성
		AAA.BBB bbb = aaa.new BBB();
		
		System.out.println("aaa.a : "+aaa.a);
		System.out.println("bbb.y : "+bbb.y);
		System.out.println("BBB.x : "+AAA.BBB.x); // static이 붙어있기때문에 
	}
}

