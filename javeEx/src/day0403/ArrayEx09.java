package day0403;

public class ArrayEx09 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 2 4 6 8 10
		// for문 짝수의 합, 짝수의 개수
		int sum=0;
		int count=0;
		for(int a=0; a<numbers.length; a++) {
			if(numbers[a]%2==0) { // 짝수 numbers[1], numbers[3]
				sum += numbers[a];
				count++;
			}
		}
		System.out.println("짝수의 합은 : "+sum);
		System.out.println("짝수의 개수 : "+count);
		
		// foreach문 짝수의 합, 짝수의 개수
		count=0;
		sum=0;
		for(int a : numbers) { // 1, 2, 3, 4, 5 a 자체에 numbers 값이 대입됨 고로 인덱스가 필요없음.
			if(a%2==0) {
				sum += a;
				count++;
			}
		}
		System.out.println("짝수의 합은 : "+sum);
		System.out.println("짝수의 개수 : "+count);
	}
}
