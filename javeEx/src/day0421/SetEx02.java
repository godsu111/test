package day0421;
/*
	TreeSet
		자동 정렬 기능
*/
import java.util.TreeSet;

public class SetEx02 {
	public static void main(String[] args) {
		TreeSet<Character> ts = new TreeSet<Character>();
		ts.add('F');
		ts.add('A');
		System.out.println(ts);
		ts.add('z');	// 소문자
		ts.add('B');
		ts.add('K');
		System.out.println(ts);
		ts.add('k');
		ts.add('b');
		
		
		System.out.println(ts);
	
		// 정렬은 가장 마지막에 하는 작업
		
		// 로또 번호를 가진 TreeSet 객체
		TreeSet ts2 = new TreeSet();
		
		/*while(ts2.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			ts2.add(num);
		}
		System.out.println("이번주 로또 번호 : "+ts2); */
		
		for(int i=0; ts2.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			ts2.add(num);
		}
		System.out.println("이번주 로또 번호 : "+ts2);
		
		TreeSet<String> ts3 = new TreeSet<String>();
		ts3.add("개");
		ts3.add("고양이");
		ts3.add("소");
		ts3.add("양");
		System.out.println(ts3);
	}
}
// Math.random() 0~1까지 랜덤 실수 0.0 ~ 0.999999xxxx
// (int)Math.random()*10+1 -> 1~10까지 랜덤한 정수 
