package day0403;

public class ArrayMyEx05 {
	public static void main(String[] args) {
		int[] numbers = {13, 45, 66, 67, 90};
		
		//for문 홀수들의 합, 홀수 개수
		// 1. 변수만들기. 합을 담을 변수, 홀수의 개수를 담을 변수
		int sum = 0;
		int x=0;
		for(int a=0; a<numbers.length; a++) {
			if(numbers[a]%2 == 1) {
				sum += numbers[a];
				x++;
			}
		}
		System.out.println("홀수들의 합은 : "+sum);
		System.out.println("홀수의 개수는 : "+x);
		
		//foreach문을 응용해서 만들기
		sum=0;
		x=0;
		for(int a : numbers) {
			if(a%2==1) {
				sum+=a;
				x++;
			}
		}
		System.out.println("홀수들의 합은 : "+sum);
		System.out.println("홀수의 개수는 : "+x);
	}
}
