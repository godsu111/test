 package day0422;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
  Set 값 꺼내기
 	  값만 저장, 순서/위치정보(index)가 없음
 	  get(i) 메서드 존재 X
 	  
 	  1. 향상된 for 문은 사용 가능
 	  		개수, 순서 중요하지 않음
 	  		있는 만큼 반복해서 꺼내줌
 	  
 	  2. Iterator 사용 : 내부 반복자
 	  	  컬렉션 요소를 하나씩 확인하며 꺼내는 반복자
 	  	  hasNext()	  : 다음 요소가 있는 지 확인
 	  	  next()	  : 꺼내고 다음 요소로 넘어감
 	  	  remove()	  : 현재 위치의 요소를 제거	- 선택/지정
 */
public class SetEx05 {
	public static void main(String[] args) {
		// 객체 생성
		Set<String> set = new HashSet<String>();
		
		// 값 넣기
		set.add("spring");
		set.add("summer");
		set.add("fall");
		set.add("winter");
		set.add("cloud");
		set.add("sunny");
		set.add("side");
		set.add("up");
		
		// 1. foreach 문
		for(String s : set) {
			System.out.print(s+" "); // 순서가 없다
		}
		System.out.println();
		
		// 2. Iterator 사용!
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) { // 값 존재 : true, false가 나올때까지
			String s= iter.next();
			System.out.print(s+" ");  
		}
		
		System.out.println();
		// Iterator 의 remove() 메서드 사용!
		Iterator<String> iter2 = set.iterator();
		while(iter2.hasNext()){
			String str = iter2.next();
			if(str.startsWith("s")) { // s로 시작하는 
				iter2.remove();
			}	
		}
		System.out.println("삭제 후 : "+set);
	}
}










