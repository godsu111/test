package day0408;

// 다른 패키지의 클래스를 사용할 경우 임포트!
import day0409.Access1;

public class AccessMain {
	public static void main(String[] args) {
		// 정적(static)변수 사용 -> 클래스이름.변수이름
		System.out.println(Access2.a);	// public - 모든 접근 허용
		System.out.println(Access2.b);	// protected - 같은 패키지내, 상속 관계
		System.out.println(Access2.c);	// default - 같은 패키지
//		System.out.println(Access2.d);	// private - 같은 클래스
		
		System.out.println(Access1.a);
//		System.out.println(Access1.b);	// 다른 패키지
//		System.out.println(Access1.c);	// 다른 패키지
//		System.out.println(Access1.d);	// 다른 클래스
	}
}
