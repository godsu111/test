package day0326;

public class VarEx09 {
	public static void main(String[] args) {
		// 자동 타입 변환
		// 작은 타입 -> 큰 타입 대입 
		// 실수 > 정수 
		// 정수 : byte < short < int < long
		// 실수 : float < double
		char a = 'A';
		System.out.println(a);
		
		int b = a;
		System.out.println(b); // 자동 타입 변환 
		System.out.println((int)a);
		
		double c = a; 	// 한개의 소수점을 가진다.
		System.out.println(c);
	}
	
}
