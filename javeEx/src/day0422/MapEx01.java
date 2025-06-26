package day0422;

import java.util.HashMap;
import java.util.Map;

/*
	Map 인터페이스
		Key - Value 쌍으로 저장.  K-V 한쌍 : Entry
		Key 중복 불가, Value 중복 가능
		.put(키, 값); / .get(키);
*/
public class MapEx01 {
	public static void main(String[] args) {
		// 객체 생성
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// .put(key, value) : 값 넣기
		map.put(33, "aa");
		map.put(100, "bb");
		map.put(20, "ccc");
		System.out.println(map);
		
		// .put(같은 키, 새로운 값) : 값 덮어쓰기 
		map.put(100, "test");
		System.out.println(map); // bb가 test로 덮어쓰기됨
		
		// .get(키)	: 키에 해당하는 값을 꺼내기
		String value = map.get(100);
		System.out.println("key 100에 대한 value : "+value);
	
		// .containsKey(키) / containsValue(값)
		boolean result1 = map.containsKey(33);
		boolean result2 = map.containsValue("ddd");
		System.out.println("33인 key가 존재하나? : "+result1);
		System.out.println("ddd인 value가 존재하나? : "+result2);
	}
}


