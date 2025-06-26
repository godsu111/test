package day0409;
/*
	final 
		최종의 의미. 변경 불가
		클래스, 변수, 메서드 앞에 사용 가능
		변수 앞에 붙으면 대입 불가능. 고정값이 된다.
		관례)	모두 대문자로 사용, 띄어쓰기는 _ 사용
*/
public class FinalEx01 {
	public static void main(String[] args) {
		// 변수 선언 : 자료형 변수명;
		// 1. 선언과 동시에 대입
		final int MAX_NUM = 100;	// 최대값
		
		// 2. 선언 후 대입
		final int MIN_NUM;			// 최소값
		MIN_NUM = 0;				// 사용 전 초기화
//		MIN_NUM = 10;
		
		System.out.println("최대값 : "+MAX_NUM);
		System.out.println("최소값 : "+MIN_NUM);
		
//		MIN_NUM =10; // 변경 불가능
	}
}
