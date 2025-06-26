package day0421;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListEx03 {
	public static void main(String[] args) {
		// 타입 지정 X, Object(모든 타입)이 들어갈 수 있다.
		ArrayList list = new ArrayList();
		list.add("hello");	// String 타입의 객체
		list.add(100);		// int 값
		
		Date day = new Date();
		list.add(day);	// Date 객체 
		System.out.println("list : "+list); // Object 클래스의 메서드 toString()이 오버라이딩이 돼서 주소값이 아닌 날짜와 시간이 출력됨
		
		Object obj = list.get(0);
		String str = (String) obj;
		System.out.println(str);
			
		// <> 제네릭을 이용하여 list2 안에 들어갈 값의 타입 지정
		List<String> list2 = new ArrayList<String>();
		list2.add("hello");
		list2.add("List");
		list2.add("world");
		System.out.println("list2 : "+list2);
		
		String aaa =list2.get(1);
		System.out.println(aaa);
		list2.add("welcome");
		list2.add("^^");
		
		// 반복문으로 값 꺼내기
		// 기본 for 문 for(초기식; 조건식; 증감식){실행문;}
		for(int a=0; a<list2.size(); a++) {
			System.out.println(list2.get(a));
		}
		System.out.println("============");
		
		// 향상된 포문 foreach문 for(타입 변수 : 반복대상){실행문;}
		for(String str1 : list2) { 
			System.out.print(str1+" ");		
		}
	}
	
}

