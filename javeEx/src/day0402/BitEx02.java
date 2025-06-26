package day0402;

public class BitEx02 {
	public static void main(String[] args) {
		// 비트 연산자 - 비트단위로 연산
		
		
		// & (and 연산자) : 두 비트 값이 모두 1인 경우 결과 1
		// 10진수  5 -> 2진수 : 0101, 10 -> 1010
		int num1 = 5;
		int num2 = 10;
		int result = num1 & num2;
		System.out.println(result);
		
		// | (or 연산) : 비트 값이 하나라도 1이면 결과 값이 1
		int num3 = 5;
		int num4 = 10;
		int result2 = num3 | num4;
		System.out.println(result2);
		
		
		// 5 & 7     101            자리에 있는수 X 진수의 거듭제곱
		// 5 & 7     111
		
		int a = 5;
		int b = 7;
		int result3 = a & b;  // 101
		System.out.println(result3); 
		
		int result4 = a | b;  // 111
		System.out.println(result4); // System.out.pritnln( 5 | 7)
	}
}
