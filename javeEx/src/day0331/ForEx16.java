package day0331;

public class ForEx16 {
	public static void main(String[] args) {
		// 1~100까지 반복, 홀수의 합, 짝수의 합
		// odd - 홀수의 합 even - 짝수의 합
		int even=0;
		int odd=0; // 사용할 것이기에 초기화를 해줘야함
		for(int a=1; a<=100; a++) {
			if(a%2==0) { //현재 숫자를 2로나눈 나머지가 0이다 : 짝수
				even+=a; 
			}
			else { //if문의 조건식의 결과가 false 이다. : 홀수
				odd+=a;
			}	
		}// for문 종료
		System.out.println("짝수들의 합은 "+even);
		System.out.println("홀수들의 합은 "+odd);
	}
}
