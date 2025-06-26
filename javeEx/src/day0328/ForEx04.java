package day0328;

public class ForEx04 {
	public static void main(String[] args) {
		// 1~5까지합
		// for(초기식; 조건식; 증감식){ 실행문; }
		// 반복하는 횟수, 합
		int num; // 반복에 사용할 변수
		int sum=0; // 합을 담을 변수
		for( num = 1; num <=5; num++) {
			// 1+2+3+4+5
			sum += num; // 1+2+3+4+5 sum = sum + num
		}
		System.out.println(sum);
		// 1~10까지의합
		int num1;
		int sum1=0;
		for (num1=1; num1<=10; num1++) {
			sum1 += num1;
		}
		System.out.println("1부터 10까지의 합 : " + sum1);
		int num2;      // 반복되는 수 
		int sum2 = 0;  // num2를 담을 그릇(합이되는변수)
		for(num2=1; num2<=10; num2++) {
			sum2 = sum2 + num2; // +1+2+3+....+10
			//sum2 += num2;
		}
		System.out.println(num2-1+"까지의 합 : "+sum2); // 1부터 10까지의합
	}
}
