package day0421;

import java.util.ArrayList;
import java.util.Collections;

public class ListEx05 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(new Integer(10));	// list.add(10); 이랑 동일하지만 객체 활용
		list1.add(new Integer(5));	// 1번 인덱스
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(3));
		list1.add(new Integer(1));
		list1.add(new Integer(7));
		list1.add(new Integer(90));
		
		System.out.println("list1 : "+list1);
		
		// .subList(포함 인덱스, 미만 인덱스)
		list1.subList(1, 6);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1,6));
		System.out.println("list2 : "+list2); // 마지막 인덱스 미만
		System.out.println("list1 : "+list1);
		
		// .sort()	: 정렬 기능 - 오름차순
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println("정렬 후 list1 : "+list1);
		System.out.println("정렬 후 list2 : "+list2);
		// Collections.reverseOrder() : 내림차순
		Collections.sort(list1, Collections.reverseOrder());
		Collections.sort(list2, Collections.reverseOrder());
		
		System.out.println("역순 정렬 : "+list1);
		System.out.println("역순 정렬 : "+list2);
		
		// .contains(value) : 단순 포함 유무 확인 : true/false  
		// list1안에 list2 객체가 들어있나?
		boolean result = list1.contains(0);
		System.out.println("result : "+result);
		System.out.println(list1.contains(5)); // true
		System.out.println(list2.contains(9)); // false 
		System.out.println("list1.contains(list2) : "+list1.contains(list2)); // false, 같은 객체가 아님
		System.out.println("list2.contains(list1) : "+list2.contains(list1)); // false
		
		// .containsAll() - 값을 하나하나 비교해서 true와 false가 나온다.
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2)); // list2에 들어간 값하나하나가 list1에 들어가있는지 확인하는 메서드
		System.out.println("list2.containsAll(list1) : "+list2.containsAll(list1));
		
		ArrayList list3 = list2;
		
		if(list3.equals(list2)) {
			System.out.println("list1과 lis2는 동일합니다");
		}
		
		// .retainAll() : 교집합만 남기고 나머지 삭제
		// list1에 list2와 동일한 값만 남기고 나머지 삭제 
		list1.retainAll(list2);
		System.out.println(list1);
		System.out.println(list2);
		
		if(list1.equals(list2)) {
			System.out.println("두 list가 동일합니다.");
		}
		System.out.println(list1);
		
		int max = 0;
		for(int i=0; i<list1.size(); i++) {
			if(list1.get(i)>max) {
				max = list1.get(i);
			}
		}
		System.out.println(max);
	}
}


	
