package day0327;

public class OperEx11 {
	public static void main(String[] args) {
		//문자열 연산 : + 기호만 사용한다. 연결한다 라는 의미
		//String 타입과 + 하면 무조건 String 타입으로 결과가 나온다
		int a = 100; // 숫자 100
		int b = 200;
		String str = "100"; // 문자 100
		System.out.println(a+b);   // 100 + 200 = 300
		System.out.println(a+str); //100100 -> int + String -> String
		System.out.println(str+a+b);
		System.out.println("변수 a의 값은 "+a);
	}
}
