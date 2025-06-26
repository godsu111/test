package day0401;

public class ContinueEx04 {
	public static void main(String[] args) {
		for(int a=1; a<=10; a++) {
			if(a%5==0) {
				continue; // 증감식으로 간다 break와 다르게.
			}
			System.out.println(a);
		}// for문 종료
		System.out.println("Hello");
	}// main 종료
}
