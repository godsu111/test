package day0422;
import java.util.*;

public class Temp3 {
	public static void main(String[] args) {
	// 배열은 중복이 가능하다. 고로 배열을 Set으로 바꿔 중복을 제거한다
		Object arr[] = {1,"1",1,2,2,3,3,4,5,6,6,"6","6",7,8};
		Set s = new HashSet();
		for(Object obj : arr) {
			s.add(obj);
		}
		System.out.println(s);
		
		for(int i=0; i<arr.length; i++) {
			s.add(arr[i]);
		}
		System.out.println(s);
		List<Object> list = new ArrayList<Object>();
		for(Object obj :arr) {
			list.add(obj);
		}
		System.out.println(list); // List는 중복 제거 X
		
		Set<Object> ss = new TreeSet<Object>();
		for(Object obj :arr) {
			ss.add(obj.toString());
		}
		System.out.println(ss);
	}
}
