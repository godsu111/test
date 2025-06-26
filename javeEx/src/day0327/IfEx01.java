package day0327;

public class IfEx01 {
	public static void main(String[] args) {
/*
		if문
		if( 조건식 ){
		    실행문;
			...
		}	
        : 조건식 결과가 true 일 때 {} 안의 실행문을 실행한다.
        조건식의 결과가 t/f 로 나오도록 구성 
 */
		int age = 7;
		if( age >= 8 ) {
			// 조건식이 true 일 때 수행
			System.out.println("학교에 다닙니다.");
			
		}
		System.out.println("상관없음");
	}
}
