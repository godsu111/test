package day0328;

public class ForEx04445 {
	public static void main(String[] args) {
		// 1~10중 짝수들의 합
		int num2;      // 반복되는 수 
		int sum2 = 0;  // num2를 담을 그릇(합이되는변수)
		for(num2=2; num2<=10; num2+=2) {
			sum2 = sum2 + num2; // +1+2+3+....+10
			//sum2 += num2;
		}
		System.out.println(num2-1+"까지의 합 : "+sum2); // 1부터 10까지의합
				
	}
}

