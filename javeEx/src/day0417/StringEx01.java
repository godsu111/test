package day0417;
/*
	String 클래스 
		자바에서 문자열을 사용할 수 있도록 String 클래스 제공
		String 클래스의 객체 생성 방식
		1)	문자열을 코드상에서 직접 입력하여 객체 자동 생성 방식 String str = "JAVA"; < - 리터럴(직접입력방식)
		2)	다양한 생성자를 이용하는 방식
*/
public class StringEx01 {
	public static void main(String[] args) {
		String str1 = new String("abc"); // String str1 = "abc";와 동일
		String str2 = new String("abc");
		
		// == : 기본 적인 값 비교	.equals() 객체 비교
		System.out.println(str1==str2);		// new 새로운 객체. 주소가 다르다
		boolean result = str1.equals(str2);	// 자동 오버라이딩된 equals임으로 true
		System.out.println(result);
		
		String str3 ="abc";
		String str4 ="abc";
		
		// 주소값 비교
		if(str3 == str4) {
			System.out.println("str3와 str4는 참조가 같다.");
		}else {
			System.out.println("str3와 str4는 참조가 다르다.");
		}
		
		// 문자열 비교
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 문자열이 같다.");
		}else {
			System.out.println("str3과 str4는 문자열이 다르다");
		}
	}
}










