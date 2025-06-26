package day0403;

public class ArrayMyEx03 {
	public static void main(String[] args) {
		String[] grades = {"A","B","C","D","E","F"};
		//for문으로 출력
		for(int a=0; a<grades.length; a++) {
			System.out.println(grades[a]); 
		}
		//foreach문으로 출력
		for(String s : grades) {
			System.out.println(s);
		}
		int[] numbers = {1,2,3,4,5,6,7,8};
		//for문으로 출력
		for(int a=0; a<numbers.length; a++) {
			System.out.println(numbers[a]);
		}
		//foreach문으로 출력
		for(int a : numbers) {
			System.out.println(a);
		}
	}
}
