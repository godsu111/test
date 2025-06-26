package day0422;

import java.util.HashMap;
import java.util.Map;

public class MapEx03 {
	public static void main(String[] args) {
		// 객체 생성 키-값 쌍을 저장, 키는 중복 불가, 순서 X
		Map<String,String> map = new HashMap<String,String>();
		
		// 값 넣기
		map.put("강아지", "멍멍");
		map.put("고양이", "야옹");
		map.put("소", "음메");
		map.put("양", "메에");
		map.put("앵무새", "안녕");
		
		// 중복 값 넣기
		map.put("고양이", "냥냥냥"); // 덮어쓰기
	
		
		System.out.println("전체 : "+map);	//{} 중괄호 안에 K=V 쌍으로 출력
		
		// 값 꺼내기
		String sound = map.get("고양이");
		System.out.println("고양이 울음소리 : "+sound);
		
		// containsKey() 단순 포함유무
		boolean result = map.containsKey("두더지");
		System.out.println("두더지가 있나? : "+result);
		
		// remove(key) : k-v 쌍으로 지워짐
		map.remove("양");
		System.out.println("양 제거 후 : "+map);
	
		// 크기, 개수
		int mary = map.size();
		System.out.println("몇 마리? : "+mary);
	
	
	}
}

