package day0331;

public class ForMyEx08 {
	public static void main(String[] args) {
		int num;      // 반복문 안에서 사용할 변수
		int odd = 0;      // 홀수의 합
		int even = 0;     // 짝수의 합
		
		for(num=1; num<=100; num++) {
			if(num%2 == 1) {  // 홀수
				odd +=num;    // odd += num;
			}
			else {  // 짝수
				even +=num;
			}
		}//for문 종료
		System.out.println("홀수들의 합 = "+odd);
		System.out.println("짝수들의 합 = "+even);
	}
}










