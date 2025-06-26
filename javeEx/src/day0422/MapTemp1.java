package day0422;
import java.util.*;
public class MapTemp1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		// keySet() 키만 모아놓은 덩어리
		for(String key : map.keySet()) {
			int value =map.get(key); 
			System.out.println(value);
		}
		// values() 값만 모아놓은 덩어리
		for(int a : map.values()) {
			System.out.println(a);
		}
		// entrySet() 키와 값 한쌍 묶어놓은 덩어리
		for(Map.Entry<String, Integer> a : map.entrySet()) {
			String key =a.getKey();
			int var = a.getValue();
			System.out.println(key+" "+var);
		}
	}
}
