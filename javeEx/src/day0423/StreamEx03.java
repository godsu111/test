package day0423;

import java.util.Arrays;

public class StreamEx03 {
	public static void main(String[] args) {
		int result = Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9,10})
				.filter(n-> n%2==0)		// 짝수 필터링
				.map(n->n*n)			// 제곱 한 후
				.sum();					// 다 더함 
		System.out.println("결과 : "+result);
	}
}
