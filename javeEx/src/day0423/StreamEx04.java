package day0423;

import java.util.Arrays;

/*
  	필터링
	filter(조건)	: 조건에 맞는 요소만 추출 
	distinct()	: 중복 제거 
*/
public class StreamEx04 {
	public static void main(String[] args) {
		Arrays.stream(new int[]{1,2,2,3,4,4,5})
			  .distinct()			// 중복 제거		1 2 3 4 5
			  .filter( n->n%2 !=0)	// 홀수만 추출	 	1 3	5
			  .forEach(System.out::println);	// 출력 1 3 5
	}
}
