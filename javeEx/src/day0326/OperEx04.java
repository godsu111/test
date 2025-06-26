package day0326;

public class OperEx04 {
	public static void main(String[] args) {
/*
	나머지 연산자 %
	10 % 2 = 0
	10 % 3 = 1
	10 % 4 = 2 
	10 % 7 = 3 
	10 % 12 = 10 나눌 수 없음.
*/
		int a = 15;
		System.out.println(a%3);  // 0
		System.out.println(a%4);  // 3 
		System.out.println(a%20); // 15
//		
		int b = 3;
		System.out.println(a%b);
		
		int c = 4;
		int sum = a+b+c;
		System.out.println(sum);
	}
}



















