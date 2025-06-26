package day0423;

import java.util.stream.IntStream;
import java.util.stream.Stream;

// reduce( )	누적 집계
public class StreamEx11 {
	public static void main(String[] args) {
		int sum = IntStream.of(1,2,3,4,5)
			     .reduce(0, (x,y) -> x+y);
		System.out.println("총합 : "+sum); // 0+1+2+3+4+5

		System.out.println();
		int result = IntStream.of(1,2,3,4)
			     .reduce(1, (a,b)->a*b);
		System.out.println("곱 결과 : "+result); // 1*1*2*3*4
	
		String result2 = Stream.of("가","나","다","라","마")
			  .reduce("",(a,b)-> a+b);
		System.err.println("문자열 연결 : "+result2); //""+"가"+"나"+"다"+"라"+"마"
		
	}
}



























