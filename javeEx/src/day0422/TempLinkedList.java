package day0422;
import java.util.*;

public class TempLinkedList {
	public static void main(String[] args) {
		long start;
		long end;
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println(end-start);
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println(end-start);
		// 결론 LinkedList(list2)가 작업 처리가 더 빠름
	}
}
