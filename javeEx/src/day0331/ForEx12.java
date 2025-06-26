package day0331;

public class ForEx12 {
	public static void main(String[] args) {
		// 반복문 속 조건문 <-> 조건문 속 반복문
		// 1~10까지 반복 , 홀수 짝수 출력
		for(int a=1; a<=10; a++) {
			if( a%2 == 0) { // 짝수
				System.out.println(a+" = 짝수");
			}
			else { // 홀수
				System.out.println(a+" = 홀수");
			}// if문 종료
		}// for문 종료
	}
}
