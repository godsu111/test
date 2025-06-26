package day0327;

public class OperEx03 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		// 더하기 연산 출력 
		System.out.println( a + b );    // 10 + 10 = 20
		System.out.println( ++a + b );  // 11 + 10 = 21
		
		int c = 10;
		int d = 10;
		// 더하기 연산 출력
		System.out.println( ++c + ++d ); // 11 + 11 = 22
		
		int e = 10;
		int f = 10;
		System.out.println( e++ + f++); // 10 + 10 = 20 더하기가 먼저
		
		int g = 10;
		System.out.println( ++g + ++g ); // 11 + 12 = 23
		
		int h = 10;
		System.out.println( h++ + h++ ); // 10 + 11 = 21
		System.out.println(h);           // 12
		System.out.println(e+f);         // 11 + 11 = 22
	}
}
