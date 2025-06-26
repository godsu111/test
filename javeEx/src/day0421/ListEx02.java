package day0421;

import java.util.ArrayList;

public class ListEx02 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println("list1 : "+list1);
		
		// 기존의 list1 값을 복사해서 생성
		ArrayList list2 = new ArrayList(list1);
		System.out.println("list2 : "+list2);
		System.out.println("list1 : "+list1);
		
		int a = 10;
		int b = a;
		System.out.println("a의 값 : "+a);
		System.out.println("b의 값 : "+b);
	}
}

