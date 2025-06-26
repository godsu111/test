package day0402;

public class ArrayEx01 {
	public static void main(String[] args) {
		int a=10;   //
		int b=a;    // b=10 / a=20 영향 주지 않음. 독립적
		a = 20;     // a의 값 변경
		
		String str1="hello";
		String str2=str1;     // str1이 가리키는 주소값 복사
		// str1="java";
		
		System.out.println(str1 == str2);  // 같은 주소값을 가지고 있다.
	}
}
/*
	* 기본 타입, vs 참조 타입 
		기본타입 변수
			- 정수형, 실수형, 논리형
			- 변수는 하나의 값을 저장
		참조타입 변수
			- 배열, 클래스, 인터페이스,...
			- 무엇을 참조하나? : 메모리의 주소
			- 값이 아닌 객체의 주소 값을 가지고 있다.

	* 메모리 영역	
		스택(stack) 
			: 모든 변수(기본타입 변수(+값), 참조타입 변수(주소) ex int a=10; String str=객체의주소) 
		힙(heap)   
			: 객체가 있고 객체 안에 값이 있음.
		메서드 





*/