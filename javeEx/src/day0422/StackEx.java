package day0422;

import java.util.Stack;

/*
	Stack 클래스 : FILO / LIFO
	순서대로 쌓이지만 인덱스가 없음
	push()	- 값을 넣기
	peek()	- 위의 값 확인
	pop()	- 꺼내서 제거
*/
public class StackEx {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push("1");
		st.push("2");
		st.push("3");
		System.out.println(st.peek());
		
		st.pop();	// 완전 제거 => "3" 삭제
		System.out.println(st.peek()); // "2"
		
		st.push("5"); // 2 위에 쌓인다.
		System.out.println(st.peek()); // "5"
		
		st.pop();
		st.pop();
		System.out.println(st.peek());
	}
}