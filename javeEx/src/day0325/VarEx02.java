package day0325;

public class VarEx02 {
	public static void main(String[] args) {
		// 변수 : 하나의 값을 저장하는 메모리 //
		// 선언 : 데이터타입 변수이름; int = a;
		// 대입 : 변수이름 = 값;  a = 1;
		// 선언과 대입 : 데이터타입 변수이름 = 값; int a = 1;
		int a;  // 선언
		a = 10; // 대입
		System.out.println(a);  //" "안 에넣는 것은 문자
		// 변수 a를 읽는다(사용한다) : 변수 안에 있는 값을 사용한다.
		
		// int a = 20; 변수의 이름은 중복 불가 
		int qwerqwerqwer; // 변수의 이름은 길이 제한이 없다
		qwerqwerqwer = 20;
		System.out.println(qwerqwerqwer);
		
		// 대입 또 가능
		a = 30; 
		System.out.println(a); // 마지막에 대입한 값만 남는다 변수는 바뀔 수 있다.
		
		int b;   // 선언
		b = 200; // 대입
		System.out.println(b);
		// System.out.println(a,b); 출력문 안에서는 하나의 값만 사용가능하다.
		
		int c; 
		c = b;   // 같은 데이터 타입이기때문에 대입이 가능하다. 값의 복사
		System.out.println(c); 
	}
}
