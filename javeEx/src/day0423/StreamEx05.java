package day0423;

import java.util.Arrays;

/*
	매핑
	map()	: 요소를 다른 값으로 변환	

*/
public class StreamEx05 {
	public static void main(String[] args) {
		Arrays.stream(new String[] {"a","b","c","d","e"})
			  .map(String::toUpperCase)		// 소문자 -> 대문자
			  .forEach(System.out::println);
	}
}
