package day0331;

public class ForEx02 {
	public static void main(String[] args) {
		// 중첩 for문 : for문 속에 for문이 들어간다.
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=5; b++) { // 1 2 3 4 5
				System.out.println(a+" - "+b);
			}
			System.out.println("==========");
		}
		// for문 속 for문 2개
		for(int b=1; b<=5; b++) {
			for(int x=1; x<=5; x++) {
				System.out.println(b+" - "+x);
			}
			for(int y=1; y<=5; y++) {
				System.out.println(b+" hello");
			}
		}
	}
}

















