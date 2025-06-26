package day0422;

import java.util.LinkedList;
import java.util.Queue;

/*
	Queue 인터페이스
		FIFO / LILO
		add()	: 값 넣기
		poll()	: 값 꺼내기(삭제)
		peek()	: 값 확인
*/
public class QueueEx {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("apple");
		q.add("banana");
		q.add("grape");
		System.out.println("처음 q : "+q);

		String a = q.poll();
		System.out.println("꺼낸 값 : "+a);
		System.out.println("q 상태 : "+q);
		
		String p =q.peek(); // 값을 꺼내고 삭제하는게 아니라 확인만 함
		System.out.println("p 확인 : "+p);
		System.out.println("q 상태 : "+q);
	
	}
}
