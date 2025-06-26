package day0328;

public class ForEx01 {
	public static void main(String[] args) { // 반복문
/* 		for 문
		가장 많이 사용하는 반복문
		반복문을 구현하는데 필요한 요소들과 함께 작성
		
		for( 1. 초기식; 2. 조건식; 4. 증감식 ){
			3. 실행문;
		}
		
		초기식 - 처음 한번만 실행, for문에서 사용할 변수 초기화
		조건식 - 결과가 true이면 실행문을 실행, false 이면 종료
		증감식 - for문에 사용하는 변수의 값을 증가/감소 시킴.
		** 수행 순서를 이해하는 것이 중요하다!
*/
		// hello java 5번 출력하기
		int a;
		for( a=1; a<=5; a++ ) {
			System.out.println("Hello Java");
		}
	}
}
