package day0326;

public class OperEx02 {
	public static void main(String[] args) {
		// 산술 연산자 ( +, -, *, /, % )
		int a = 10;
		double d = 10.5;
		System.out.println(a+d);
		
		int result = (int)(a+d);
		double result2 = a+d;
		System.out.println(result);  //0.5 값의 손실
		System.out.println(result2);
	
		int num = 10;
		int value;
		value = num+10; // 20
		num =value;   	// 20
		System.out.println(value);
		System.out.println(num);
		
	}
}