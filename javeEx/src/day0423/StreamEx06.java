package day0423;

import java.util.Arrays;

/*
	정렬
	sorted()	: 요소를 정렬. 기본이 오름차순

*/
public class StreamEx06 {
	public static void main(String[] args) {
		Arrays.stream(new int[] {10,5,3,6,2,7,4,8,3,9,})
		      .sorted()	// 오름차순
		      .distinct()
		      .forEach(System.out::println);
	}
}
