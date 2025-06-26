package day0409;
/*
	static 정적 멤버
		- 객체 생성 할 필요 없음. -> 클래스명.변수 클래스명.메서드()
		- 프로그램이 시작할 때 메모리에 올라감(사용 준비 완료)
*/
public class StaticEx01 {
	// 리턴타입 메서드명(매개변수,..){실행 코드}
	// 정적 메서드
	static int add(int a, int b) {
		return a+b;
	}
	// 인스턴스 메서드
	int minus(int a, int b) {
		return a-b;
	}
}
