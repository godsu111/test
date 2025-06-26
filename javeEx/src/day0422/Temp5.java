package day0422;

import java.util.*;
public class Temp5 {
	public static void main(String[] args) {
		Set<String> set = new HashSet();
		set.add("a");
		set.add("b");
		set.add("a");
		set.add("c");
		set.add("f");
		set.add("k");
		
	/*	// 향상된 for문으로 Set 안에있는 값 구하기
		for( String s : set) {
			System.out.println(s);
		}*/
		// Iterator 사용 
		Iterator<String> s =set.iterator();
		while(s.hasNext()) { // 다음 값이 있는 지 없는지 true /false 
			String as = s.next(); // 실제로 값을 꺼내옴
			if(as.startsWith("c")) {
				s.remove();
				continue;
			}
			
			System.out.println(as);
		}
		
	
	}
}
