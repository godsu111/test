package day0416;
/*
	hashCode()
		객체를 구분할 수 있는 값.
		참조변수(객체의 주소값) 출력 -> 16진수의 숫자 값 : 해시코드의 값
		
*/
public class Object02 {
	public static void main(String[] args) {
		String str1 = new String("abc"); 
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		int result = str1.hashCode();
		System.out.println(result);
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer("1234");
		Integer i2 = new Integer(1234);
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(i1.equals(i2));
	}
	
}




















