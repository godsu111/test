package day0422;
import java.util.*;


class Human implements Comparable<Human>{
	String name;
	
	Human(String name){
		this.name=name;
	}
	@Override
	public int compareTo(Human o) {
		return this.name.compareTo(o.name);
	}
	public String toString() {
		return name;
	}
}
public class Temp2 {
	public static void main(String[] args) {
		// TreeSet 객체 생성 -> 정렬기능 
		Set<Human> tempp = new TreeSet<Human>();
		// 값넣기
		tempp.add(new Human("김"));
		tempp.add(new Human("이"));
		tempp.add(new Human("박"));
		
		// 값의 개수
		int num = tempp.size();
		System.out.println(num);
		
		for(Human s : tempp) {
			System.out.println(s.name);
		}
	}
}
