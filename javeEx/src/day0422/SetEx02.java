package day0422;
/*
  	Comparable 인터페이스	
  		정렬 기준을 스스로 정하는 인터페이스 
 	compareTo() 메서드
 		비교 기준을 정하는 메서드
 		객체(this)와 매개변수로 들어온 객체(o)를 비교한 후 정렬 순서를 결정 
 	
 */

import java.util.*;
class Person implements Comparable<Person>{
	// 변수
	String name;
	
	// 생성자
	Person(String name){
		this.name=name;
	}
	
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}

	public String toString() {
		return name;
	}
	
	
	
}
public class SetEx02 {
	public static void main(String[] args) {
		// 객체 생성
		// TreeSet : 정렬 기능이 있는 Set
		TreeSet<Person> pSet = new TreeSet<Person>();
		
		// 값 넣기
		pSet.add(new Person("춘식이"));
		pSet.add(new Person("라이언"));
		pSet.add(new Person("어피치"));
		pSet.add(new Person("튜브"));
		
		// 값의 개수
		int num = pSet.size();
		System.out.println(num);
		
		// 정렬 결과 출력
		for(Person p : pSet) {
			System.out.println(p.name);
		}
	}
}























