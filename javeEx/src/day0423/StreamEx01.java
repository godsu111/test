package day0423;

import java.util.Arrays;

/*
	Stream
		데이터(리스트, 배열)를 쉽고 간결하게 처리할 수 있도록 제공 되는 자바의 기능
		반복문 없이 필터링, 변환, 집계 등 가능함
		데이터 처리 전용 파이프라인
		
	필터링	filter() distinct()
	매핑 		map()
	정렬		sorted()
	반복		forEach(), peek()
	집계 		count(), sum(),.... reduce()
	수집 		collect()
*/
public class StreamEx01 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		// 기존 for 문 방식
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println();
		for(int i=0; i<arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		// 스트림 방식 (내부 반복자)
		Arrays.stream(arr).forEach(n->System.out.print(n+" "));
	}
}
