package day0422;

import java.util.HashMap;
import java.util.Map;
/*
	Map 인터페이스
	Entry : Map 내부에 선언된 정적 (static)내부 인터페이스	
		  : Map.Entry 라고 사용
		  : k-v 쌍 하나하나를 표현하는 자료형(k-v)
*/
public class MapEx04 {
	public static void main(String[] args) {
		// 다형성
		Map<String, String> map = new HashMap<String,String>();
		map.put("java","자바");
		map.put("spring", "스프링");
/*		
		Map 자체는 반복불가
		1. keySet() 	: 키만 모아놓은 덩어리
		2. values()		: 값만 모아놓은 덩어리
		3. entrySet()	: 키와 값 한 쌍(entry) 묶어 놓은 덩어리
*/	
		// keySet()
		for(String key : map.keySet()) {
			String value = map.get(key);
			System.out.println("key=value : "+key+"="+value);
		}
		System.out.println();
		
		// values()
		for(String s : map.values() ) {
			System.out.println("value : "+s);
		}
		System.out.println();
		
		// entrySet()
		for(Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("K-V : "+key+"="+value);
		}
	}
	
}

