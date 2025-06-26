package day0327;

public class OperEx01 {
	public static void main(String[] args) {
		// 증감 (증가, 감소) 연산자 ++, -- : 1 증가, 1 감소
		//boolean 논리형 타입에서 사용 불가
		int a = 10;
		System.out.println(a); // 10
		++a; 				   // 11 선증가, 실행으로 값이 변했음
		System.out.println(a); // 11
		a++;                   // 실행 -> 12 
		System.out.println(a); // 12
		--a;
		System.out.println(a); // 11
		// 증감연산자가 변수의 뒤에 있을 때 연산이 가장 마지막에 일어남.
		//ex a++ b++ c++ d++
		// 연산, 출력 두가지 일을 한다.
		int b = 10;
		System.out.println(b);   // 10
		System.out.println(++b); // 11 선증가(선감소) 그리고 출력
		System.out.println(b);   // 출력 11
		System.out.println(b++); // 출력을 먼저(11)하고 후증가를 함(12)
		System.out.println(b);   // 출력 12 
	}
}
