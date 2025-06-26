package day0423;

import java.util.stream.IntStream;

/*
	집계
	sum(), count(), average(), max(), min() 등 기본 메서드
*/
public class StreamEx09 {
	public static void main(String[] args) {
		long result=IntStream.of(1,2,3,4,5,6,7,8,9,10).count();
		System.out.println("count result : "+result);
	}
}
