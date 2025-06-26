package day0331;

public class ForEx06 {
	public static void main(String[] args) {
		// 변수 for문 밖 선언
		// 2단 ~ 5단까지 출력
		int dan;  // 단
		int a;    // 곱해지는 수
		for(dan=2; dan<=5; dan++) { // 단의 반복 2~5
			for(a=1; a<=9; a++) {
				System.out.println(dan+" X "+a+" = "+(dan*a));
			}
			System.out.println(); // 줄바꿈
		}
	}
}
