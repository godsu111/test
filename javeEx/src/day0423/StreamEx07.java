package day0423;

import java.util.stream.IntStream;

/*
	루핑
	forEach()	: 최종 처리에서 반복
	peek()		: 중간 처리에서 값을 확인할 때

*/
public class StreamEx07 {
	public static void main(String[] args) {
		int result=IntStream.range(2, 9)
				 .peek(n -> System.out.println("중간 값 확인 : "+n)) // 출력만 할 뿐 최종결과에 영향 X
				 .sum();	
				 System.out.println("합 : "+result);
	
	}
}
