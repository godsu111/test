package day0401;

public class BreakEx03 {
	public static void main(String[] args) {
		// 주로 반복문에서 많이 사용한다.
		for(int a=1; a<=100; a++) {
			if(a%5==0) {
				break;
			}
			System.out.println(a);
		}// for문 종료
		System.out.println("hello");
		System.out.println("world");
	}
}
