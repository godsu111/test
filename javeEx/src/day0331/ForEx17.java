package day0331;

public class ForEx17 {
	public static void main(String[] args) {
		// 1~100까지 반복, 3의 배수의 합
		// 반복하는 수 , 합을 담을 변수
		int num, sum=0;
		for(num=1; num<=100; num++) {
			if(num%3==0) { // num을 3으로 나누었을때 나머지가 0인수 = 3의 배수
				sum+=num;
			}
		}
		System.out.println("1부터 100까지 3의 배수의 합 = "+sum);
	}
}
