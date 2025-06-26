package day0421;

import java.util.ArrayList;
public class ListEx04 {
	public static void main(String[] args) {
		
		// 1~10 까지 값 넣고 출력
		// .add( 값 ) .get( index )
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<11; i++) {
			list.add(i);
			Integer a = list.get(i-1);
			System.out.println(a);
		}
		System.out.println("첫번째 for문 : "+list);
		
		for (int i=0; i<10; i+=2) {
			list.add(i+1);
			Integer a = list.get(i);
			System.out.print(a+" ");
		}
		
	}
}

