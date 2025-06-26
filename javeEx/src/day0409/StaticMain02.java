package day0409;

class Static02 {
	// 정적 변수
	static int a = 10;
	// 인스턴스 변수
	int b = 1;
	
	int c = b;	// 가능
	int d = a;	// 가능
	int e = 20; 
	// static int f = e;  불가능  static은 메모리에 올라가는 순서가 다르기 때문에
	
	// 리턴타입 메서드명(매개변수,...){실행 코드}
	// 정적 메서드
	static void method1() {
		System.out.println(" 정적 메서드() 실행~~ ");
	}
	
	// 인스턴스 메서드
	void method2() {
		System.out.println(" 인스턴스 메서드() 실행~~ ");
	}
}

public class StaticMain02 {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 변수명 = new 클래스명();
		Static02 s1 =new Static02();
		
		// 정적 메서드 호출 
		// s1.method1(); 사용 가능하지만 권장하지는 않음.
		s1.method2();
		
		// 클래스명.메서드();
		Static02.method1();
		// Static02.method2(); 인스턴스메서드는 반드시 객체(인스턴스)가 필요하다 참조변수.메서드명
		
		// s1.a = 200;   사용 가능하지만 권장하지 않음
		Static02.a = 300;	// 대입 가능
		
		System.out.println("정적 변수 a 출력 : "+Static02.a);
		System.out.println("인스턴스 변수 b 출력 : "+s1.b);
		
	}
}













