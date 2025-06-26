package day0402;

public class BitMyEx01 {
	public static void main(String[] args) {
		int a = 27;  // 11011
		int b = 14;   // 01110
		int result= a & b;
		int result2 = a | b;
		System.out.println(result);  // 1010 10
		System.out.println(result2); // 11111       1+2+4+8+16 = 31
	}
}
