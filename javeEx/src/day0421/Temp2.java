package day0421;

import java.util.*;
public class Temp2 {
	// 캡슐화, 변수는 private로 접근 불가능하게하고 메서드를 이용해서 값을 변경하게 유도 .set() .get()
	// 변수
	private String name; 
	private int age;
	
	// 생성자 = 클래스명(매개변수,..){객체의 초기화 코드};
	public Temp2(String name, int age){ 
		this.name=name;
		this.age=age;
	}
	
	// 메서드 = 리턴타입 메서드명(매개변수,...){구현코드}; 
	// .set() 값 넣기
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	// .get() 값 가져오기
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		//객체 생성
		List<Temp2> list = new ArrayList<Temp2>(); // list의 타입이 Temp 클래스
		Temp2 temp = new Temp2("이상혁혁",120);
		list.add(new Temp2("이경훈",15)); // list[0]
		list.add(new Temp2("이상혁",88)); // list[1] 
		list.add(temp);
		
		// 값 가져오기 값 꺼내기
		for(Temp2 t : list) {
			String s = t.getName();
			int a = t.getAge();
			System.out.println(s+"\t"+a);
		}	
		for(int a=0; a<list.size(); a++) {
			Temp2 tt = list.get(a);
			String ttt=tt.name;
			int xxx = tt.age;
			System.out.println(ttt+"\t"+xxx);
		}
	}
	
}
