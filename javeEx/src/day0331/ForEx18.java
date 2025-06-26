package day0331;

public class ForEx18 {
	public static void main(String[] args) {
		// for(초기식; 조건식; 증감식){} - 요소 생략
		// 초기식을 생략한모습
		int a=1;       // 반복 변수 미리 선언 및 초기화
		for( ; a<6; a++) {
			System.out.println(a);
		}
		
		// 조건식 생략
		// break; 사용
		for(int b=1; ; b++) {
			System.out.println(b);
			if( b >=5 ) {
				break;
			}
		}
		
		//증감식 생략
		for( int c=1; c<6; ) {
			System.out.println(c);
			c++;
		}
		
		
		// 모든 요소 생략
		for(   ;   ;   ) {
			System.out.println("무한 반복");
		}
	}
}











