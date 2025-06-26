package day0331;

public class ForMyEx01 {
	public static void main(String[] args) {
		// 100까지 홀수의 합
		int a;
		int sum=0;
		for(a=1; a<=100; a++) {
			if(a%2 !=0) {
				sum+=a;
			}
		}
		System.out.println("1부터 100까지 숫자중 홀수들의 합은 : "+sum);
		
		// 100까지 짝수의 합
		int b;
		int sum2=0;
		for(b=1; b<=100; b++) {
			if(b%2==0) {
				sum2+=b;
			}
		}
		System.out.println("1부터 100까지 숫자중 짝수들의 합은 : "+sum2);
	}
}
