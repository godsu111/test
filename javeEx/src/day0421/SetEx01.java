package day0421;
/*
	Set 인터페이스 
		순서 X
		중복 X
*/
import java.util.Set;
import java.util.*;

public class SetEx01 {
	public static void main(String[] args) {
		// 조상의 타입에 구현 객체 대입 : 다형성
		Set set = new HashSet();
		
		
		// .add() : 값 넣기
		set.add(100);
		set.add("hello");
		set.add(777);
		System.out.println(set);	// 순서 유지 X
		
		Date day = new Date();
		Date d = new Date();
		System.out.println(day+", "+d);
		
		set.add(day);
		set.add(d); // 중복
		System.out.println(new Date());	// 중복
		System.out.println("Date 객체 : "+set);	// day 와 d 는 같기때문에 중복허용 X
		
		// 객체 생성 - > 주소값이 다 다르다.
		Test t1 = new Test();
		Test t2 = new Test();
		set.add(t1);
		set.add(t2);
		System.out.println(set);
		
		// 문자열 hello 값 중복 넣기
		set.add("hello");	// String 타입 오버라이딩된 toString() 메서드 -> "hello" 중복 불가능, 덮어쓰기
		System.out.println(set);
	
	}
}
class Test{}

