package day0423;

import java.util.stream.IntStream;

/*
	매칭
	allMatch()	: 모두 조건 만족?
	anyMatch()	: 하나라도 만족?
	noneMatch()	: 모두 불만족?
*/
public class StreamEx08 {
	public static void main(String[] args) {
		boolean result = IntStream.range(1, 10) // 1부터 10미만
				 .allMatch(n -> n<10);	// 모든 요소가 10보다 작나?
		System.out.println("모두 10 미만인가? : "+result);		 
	}	
}
