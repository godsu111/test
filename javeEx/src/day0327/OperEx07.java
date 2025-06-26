package day0327;

public class OperEx07 {
	public static void main(String[] args) {
		// 논리 연산자 ( if문 / for문 등의 제어문과 함께 쓰인다.)
		// &&, ||, !
		// && (and 연산자) : 조건이 모두 true 이면 결과가 true 이다.
		// || (or 연산자)  : 조건 중 하나라도 true 이면 결과가 true 이다. 앞 조건이 true이면 뒤에 조건은 실행 X
		// !  (not 연산자) : 결과를 반대로 나타냄.
		System.out.println( true && false );  // false
		System.out.println( true && true );   // true
		System.out.println( true && false && true ); // false 조건이 모두 true 이어야 true
		System.out.println( false && false ); // false 조건이 모두 true 이어야 true
		
		System.out.println( true || true );   // true
		System.out.println( true || false );  // true
		System.out.println( true || false || true); // true 조건 중 하나라도 true가 있으면 true
		System.out.println( false || false ); // false
		
		// 비교 연산자와 함께 사용
		int a = 10;
		boolean result = a>0 && a>1000; // true && false -> false 
		System.out.println(result);
		
		boolean result2 = a>0 || a>1000;// true || false -> true
		System.out.println(result2); //true
		
		System.out.println(!result2);//false <- 변수 result2 값이 변하는 건 아니기에 이후 출력에 true, 결과를 반대로 출력한 것 뿐	
		
		System.out.println(result2);//true 
		
		boolean result3 = !result2; // result3 = !(true) 대입 
		System.out.println(result3);// false
		
	}
}





