package day0326;

public class OperEx01 {
	public static void main(String[] args) {
		// 부호 연산자 ( + , - )
		// 양수 음수 
		int num1 = 10;
		int num2 = 20;
		System.out.println(+num1);
		System.out.println(-num2);  // 대입 아님, 출력 
		System.out.println(num2); // 값이 바뀐 것이 아님
		
		num2 = -num2; // 대입을 해야 값이 바뀜 
		System.out.println(num2);
	}
}
