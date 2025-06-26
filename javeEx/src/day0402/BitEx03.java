package day0402;

public class BitEx03 {
	public static void main(String[] args) {
		// ^ (XOR 연산자)
		// 같으면 0 다르면 1
		// 5 ^ 10 
		// 5  0101
		// 10 1010
		// 1111 = 15
		System.out.println(5^10);
		
		// ~ (NOT 연산자)
		// 0 -> 1 , 1-> 0
		// ~num : -1( num+1 )
		int num = 10;
		int result = ~num;
		System.out.println(result);
	}
}
