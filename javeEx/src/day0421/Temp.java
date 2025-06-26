package day0421;

import java.util.*;

public class Temp {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
	
		list.add(88);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(99);
		list.add(100);
		Collections.sort(list);
		System.out.println("정렬 후 list : "+list);
		System.out.println("최대값은 : "+list.getLast());
		System.out.println("최소값은 : "+list.getFirst());
		
	}
}
