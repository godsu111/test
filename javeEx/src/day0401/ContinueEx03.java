package day0401;

public class ContinueEx03 {
	public static void main(String[] args) {
		// 1~100까지 반복, 홀수의 합
		int a=1;
		int odd=0;
		for(a=1; a<=100; a++) {
			if(a%2==0) { // 짝수
				continue;
			}// if문 종료
			odd+=a;
		}// for문 종료
		System.out.println("1~100까지 홀수의 합 : "+odd);
	}
}
