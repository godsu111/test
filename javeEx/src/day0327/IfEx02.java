package day0327;

public class IfEx02 {
	public static void main(String[] args) {
/*																												
 	if-else문 
 	조건식을 만족하는 경우, 만족하지 않는 경우 모두 나타낼 때 사용.
 	
  	if( 조건식 ){
  	  // 결과가 true 일 때 실행문; 
  	} else{
  	  // 결과가 false 일 때 실행문; 
  	}
  		
  		
 */ 	int age = 2;
 		if( age >= 8 ) {
 			System.out.println("학교에 다닙니다.");
 		}else { // 선택적 사용이 가능하다. 단독 사용은 불가. 
 			System.out.println("학교에 다니지 않습니다.");
 		}
 		System.out.println("상관없음.");
 	}
}








