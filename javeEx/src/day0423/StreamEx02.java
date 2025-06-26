package day0423;

import java.util.stream.IntStream;

/*
	객체형	- Stream<T>
	기본형	- IntStream, DoubleStream, LongStream
	컬렉션, 배열, 파일 등 다양하게 생성 사용
*/
public class StreamEx02 {
	public static void main(String[] args) {
		// range(포함, 미만)	: 1,2,3,4
		IntStream.range(1, 5).forEach(System.out::println);
	}
}
