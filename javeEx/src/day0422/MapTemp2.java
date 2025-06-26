package day0422;
import java.util.*;
public class MapTemp2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("java", 100);
		map.put("jsp", 70);
		map.put("html", 60);
		map.put("css", 80);
		map.put("web", 90);
		
		Set<Map.Entry<String, Integer>> entry =map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter =entry.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> en =iter.next();
			String s=en.getKey();
			int a =en.getValue();
			System.out.println(s+" "+a);
		}
		Collection<Integer> value =map.values();
		Iterator<Integer> a =value.iterator();	
		int sum2=0;
		while(a.hasNext()) {
			sum2 +=(int)a.next();
		}
		System.out.println("총합 : "+sum2);
	}
}
