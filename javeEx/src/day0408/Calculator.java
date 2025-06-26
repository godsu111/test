package day0408;

public class Calculator { 	// 사칙연산 계산기
	// 인스턴스 메서드
	// 리턴타입 메서드이름(매개변수,...){실행코드}
	
	// 더하기 메서드
	int plus(int x, int y) {	// 리턴타입을 지정했다면 반드시 return 문을 사용
		return x+y;
	}
	
	// 마이너스 메서드
	int minus(int x, int y) {  // 서로의 영역이 다르기 때문에 같은 변수명 사용 가능
		return x-y;
	}
	
	// 곱하기 메서드
	int multiply(int x, int y) {
		int result = x*y;
		return result;
	}
	
	// 나누기 메서드
	double divide(int x, int y) {
		double result=x/y;
		return result;
	}
	
	// 전원 on
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	// 전원 off
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}













