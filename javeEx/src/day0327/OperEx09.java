package day0327;

public class OperEx09 {
	public static void main(String[] args) {
		// 복합대입 연산자 : 변수의 값이 바뀐다 
		// =, +=, -=, *=, /=, %=
		int a = 10;
		System.out.println(a+20); //30 단순 덧셈
		System.out.println(a);    //10
		
		//대입 연산자  사용
		System.out.println(a+=20); // a = a+20 와 같음 : 30
		System.out.println(a);     // 30
		
		int b = 10;
		int c = ++b;  // 증감 연산자 1증가
		int d = b+=2; // 대입 연산자  
		System.out.println(b); // 13
		System.out.println(c); // 11
		System.out.println(d); // 13
	}
}
