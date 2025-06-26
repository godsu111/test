package day0409;

class StaticA{
	int x = 100;   // 인스턴스 기본형 변수
}

class StaticB{ 
	int y = 200; 					  // 인스턴스 기본형 변수
//  StaticA a = new StaticA();        // 인스턴스 참조형 변수
	static StaticA a = new StaticA(); // 정적 참조형 변수 
}
public class StaticMain05 {
	public static void main(String[] args) {
		// 변수 x 값 출력
		StaticB b = new StaticB();
		System.out.println(StaticB.a.x);    // 정적 참조형 변수 a 사용
//      System.out.println(b.a.x); 			인스턴스 참조형 변수 a 사용
 		
		StaticA a2 = new StaticA();
		System.out.println(a2.x);
		
	}
}
