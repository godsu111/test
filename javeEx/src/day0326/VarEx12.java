package day0326;

public class VarEx12 {
	public static void main(String[] args) {
		// 문자열 String 
		// 기본 타입 아님 
		// " "(큰따옴표) 사용 
		// 공백도 문자로 취급한다
		String s; // 선언
		s = "hello "; // 값의 대입 
		System.out.println(s);
		
		String s2 = " ";
		System.out.println(s2);
		
		String s3 = "world";
		System.out.println(s3);
		System.out.println(s+s3);
		int x = 100; 
		System.out.println(s+x); //문자열과 + 정수는 문자열이됨 
	
	}
}
