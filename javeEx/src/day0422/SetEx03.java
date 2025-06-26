package day0422;
// 배열 -> Set으로 중복 제거


import java.util.*;
public class SetEx03 {
	public static void main(String[] args) {
		// 모든 타입을 담을 수 있는 배열
		Object[] arr = {"1", 1, new Integer(1), "2", "2", "3", "4", 4, "5", 5 };
	
		// HashSet 객체 생성 - 중복 제거
		Set<Object> set = new HashSet<Object>();	// 다형성
		
		// for 문 사용: 배열 값 꺼내면서 set에 값넣기
		// 기본 for 문
		for(int a=0; a<arr.length; a++) {
			set.add(arr[a]);
		}
		System.out.println("기본 for문 : "+set);
		
		// 향상된 for 문
		for(Object obj : arr) {
			set.add(obj);
		}
		System.out.println("향상된 for문 : "+set);
		
		// Object 배열 생성
		Object[] orr = {"1", 1, new Integer(1), "2", "2", "3", "4", 4, "5", 5 };
		
		// ArrayList 객체 생성
		List<Object> list = new ArrayList<Object>();
		System.out.println("====Set과 List 비교====");
		// 기본 for 문
		for(int a=0; a<orr.length; a++) {
			list.add(orr[a]);
		}
		System.out.println("기본 for문 : "+list);
		list.clear();
		System.out.println("Clear 후 List : "+list);
		
		// 향상된 for 문
		for(Object obj : orr) {
			list.add(obj);
		}
		System.out.println("향상된 for문 : "+list);
	}
}

