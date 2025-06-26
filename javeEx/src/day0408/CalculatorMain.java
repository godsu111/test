package day0408;

public class CalculatorMain {
	public static void main(String args[]) {
		// 객체 생성
		// 클래스타입 변수명 = new 클래스명();
		Calculator ca = new Calculator();
		
		// 전원 켜기
		ca.turnOn();
		
		// 더하기 5+6
		int result = ca.plus(5,6);
		System.out.println("5 + 6 = "+result);
		
		// 연산에 사용할 변수
		int a = 10;
		int b = 30;
		int r = ca.plus(a,b);
		System.out.println("a + b = "+r);
		// 빼기 10-8
		int result1 =ca.minus(10, 8);
		System.out.println("10 - 8 = "+result1);
		
		// 곱하기 10*4
		int result2 =ca.multiply(10, 8);
		System.out.println("10 * 4 = "+result2);
		
		// 나누기 20/5
		double result3 =ca.divide(20, 5);
		System.out.println("20 / 5 = "+result3);
		
		// 전원 끄기
		ca.turnOff();
	}
}
