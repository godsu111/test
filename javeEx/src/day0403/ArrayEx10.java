package day0403;

public class ArrayEx10 {
	public static void main(String[] args) {
		int[] numbers = { 10, 15, 39, 44, 56, 77, 99 };
		// 최댓값 구하기
		int max = numbers[0];
		for(int i=1; i<numbers.length; i++) { // numbers[i] 2번째부터 반복 시작
			if(numbers[i]>max) {   //현재 꺼내진 요소가 > max(numbers[0])보다 크다
				max = numbers[i];  // max 값 더 큰수로 대입
			}
		}
		System.out.println("최댓값은 : " + max);
	}
}
