package day0422;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx05 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("java", 100);
		map.put("jsp", 70);
		map.put("html", 60);
		map.put("css", 80);
		map.put("web", 90);

		Set<Map.Entry<String,Integer>> entry = map.entrySet(); // map.entrySet(); -> 키와 값을 묶어논 entry 의 덩어리
		
		Iterator<Map.Entry<String, Integer>> iter = entry.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> en = iter.next();
//			String k = en.getKey();
//			Integer v = en.getValue();
			System.out.println(en.getKey() +"="+en.getValue());
		}
		// key만 출력
		System.out.println("Keys : "+map.keySet()); 
		
		Collection<Integer> value=map.values();
		
		// 값의 총합
		int sum=0;
		for(int value1 : value) {
			sum += value1;
		}
		System.out.println("values의 총 합 : "+sum);
		System.out.println();
		
		
		Collection val2 = map.values(); // 컬렉션 프레임워크의 최고 조상 인터페이스
		Iterator iter2 = val2.iterator();
		int sum2 = 0;
		while(iter2.hasNext()) {
			sum2 += (Integer)iter2.next();
		}
		System.out.println("valuse의 총 합 : "+sum2);
	}
}
// Collections 클래스 	: 컬렉션을 도와주는 메서드가 있는 클래스
// Collection 인터페이스














