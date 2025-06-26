package day0416;
/*
 	Wrapper class
 		정수 사용할 때 기본형인 int를 사용
 		정수를 객체로 사용해야 하는 경우?
 		: 자바에서 기본 자료형처럼 사용할 수 있는 클레스 제공 하고있음.
 		
 		Byte 클래스
 		Character 클래스
 		Short 클래스
 		Integer 클래스
 		Long 클래스
 		Float 클래스
 		Double 클래스
 		Boolean 클래스 
 */
public class IntegerEx {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		
		// .intValue() : Integer 클래스 내부의 int 자료형 값 가져옴
		int iVar = i.intValue();
		System.out.println(iVar);
		
		// .valueOf(매개변수 O)  : 정수나 문자열을 바로 Integer 클래스로 반환
		Integer num1 = Integer.valueOf(200);
		Integer num2 = Integer.valueOf("300");
		System.out.println(num1+", "+num2);
		
		// .parseInt() : 숫자로 변환 가능한 문자열을 -> int(10진수)로 변환
		int num3 = Integer.parseInt("400"); // 실행중 예외 발생할 수 있음 "d400"
		System.out.println(num3);
		
		
		Double d = new Double(5.5);
		double dVar=d.doubleValue();
		System.out.println(dVar);
		
		double dValOf=d.valueOf("500.5");
		System.out.println(dValOf);
	}
}