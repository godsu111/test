package day0331;

public class ForEx01 {
	public static void main(String[] args) {
		//1~100까지의 합
		int a;
		int sum = 0;
		for (a=1; a<=100; a++) {
			sum+=a;
		}
		System.out.println(a-1+"까지의 합은 : "+sum);
		//1~100까지 홀수의 합
		int num2, sum2=0;
		for( num2 = 1; num2 <=100; num2+=2) {
			//1+3+5+7+9+...+99
			sum2+=num2;
		}
		System.out.println("1부터 100까지 중 홀수들의 합은 : "+sum2);
		//1~100까지 짝수의 합
		int num3;   // 반복할 수
		int sum3=0; // 합을 담을 변수
		for(num3=2; num3<=100; num3+=2) { //num=num3+2를 
			//2+4+6+8+10+12+...+100
			sum3+=num3;
			
		}
		System.out.println("1부터 100까지 중 짝수들의 합은 : "+sum3);
	}
}
/*
int num, sum=1;
for( num=2; num<=100; num++ ) {
	sum+=num;
	
	
}
System.out.println("1~100까지의 합 : " + sum);
*/