package day0422;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
	LinkedList
		데이터를 연결해서 저장하는 자료구조
		값을 삽입하거나 삭제할 때 작업 처리가 빠름
		링크로 연결 <-> 배열 : 값 추가/삭제 배열 이동 속도 느림.
*/
public class LinkedListEx {
	public static void main(String[] args) {
		// 시작 끝 시간으로 사용할 변수
		long start;
		long end;
		
		// ArrayList 객체 생성
		List<String> list1 = new ArrayList<String>();
		
		// LinkedList 객체 생성
		List<String> list2 = new LinkedList<String>();
		
		// list 1 사용
		start = System.nanoTime(); // 10억분의 1초, 정확한 시간 차이 측정가능
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));	// 0번쨰에 반복해서 값 추가
		}
		end = System.nanoTime();
		System.out.println("ArrayList가 걸린 시간 : "+(end-start));
		
		// list 2 사용
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i)); 	// 매개값을 String으로 변환
		}
		end =System.nanoTime();
		System.out.println("LinkedList가 걸린 시간 : "+(end-start));
		
		
	}
}
