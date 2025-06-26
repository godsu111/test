package day0423;
/*
	람다식
		메서드를 간결하게 식으로 표현하는 방법
		주로 함수형 인터페이스의 구현 객체를 만들 때 사용
		코드 간결해짐, 컬렉션을 쉽게 처리 가능
		
	람다식 		익명 함수 문법으로 코드 간결화
	사용조건 		추상 메서드가 1개만 가진 인터페이스(=함수형 인터페이스)
	@FunctionalInterface 함수형 인터페이스인지 컴파일시 체크를 해라
	형태			() -> {실행문;};
	외부변수 		읽기만 가능, 수정 불가 (final)
	메서드 참조  	클래스명::메서드명 
*/
// 함수형 인터페이스	: 추상 메서드가 하나만 있는 인터페이스
interface Printer{
	void print();	// 추상 메서드
}

public class LambdaEx01 {
	public static void main(String[] args) {
		// 인터페이스타입의 변수 = new 인터페이스(){ 추상메서드 구현 };
		
		// 기본 방식
		Printer p1 = new Printer() {
			// 추상메서드 완성
			public void print() {
				System.out.println("기본 : hello");
			}
		};
		// 메서드 호출
		p1.print();
	
		// 람다식 사용		(매개변수) -> {실행코드;};
		Printer p2 = ()-> {System.out.println("람다식 방식");};
		Printer p3 = ()-> System.out.println("{} 생략");
		
		// 메서드 호출
		p2.print();
		p3.print();
	}
}
