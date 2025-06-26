package day0327;

public class OperEx06 {
	public static void main(String[] args) {
		// 비교 연산자 (==, !=, >, <, >=, <=)
		// 비교 연산자의 결과는 true , false의 값이 나온다 논리형(boolean) 타입
		
		System.out.println( 10 == 0 );    //false
		System.out.println( 10 != 0 );    //true
		System.out.println( 10 > 0 );     //true
		System.out.println( 10 < 0 );     //false
		System.out.println( 10 >= 0 );    //true
		System.out.println( 10 <= 0 );    //false
		
		System.out.println("==============");
		
		// 변수 사용
		int num1 = 5;
		int num2 = 3;
		System.out.println( num1 > num2 );   // t
		System.out.println( num1 < num2 );   // f
		System.out.println( num1 >= num2 );  // t
		System.out.println( num1 <= num2 );  // f
		System.out.println( num1 == num2 );  // f
		System.out.println( num1 != num2 );  // t
		
		boolean value = num1 > num2;
		System.out.println(value);
		
		value = num1 <= num2;
		System.out.println(value);
		
		
	
	
		
		
		
		
	
	}
}
