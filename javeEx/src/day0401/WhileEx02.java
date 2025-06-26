package day0401;

public class WhileEx02 {
	public static void main(String[] args) {
		// 1~100까지 출력
		
		int a=1;            // 초기식
		while(a<=100) {     // 조건문
			System.out.println("1~100까지 반복"+a);  // 실행문
			a++;            // 증감식
			
			
		// 1~100가지 홀수만 출력
			
		int b=1;
		while(b<=100) {
			if(b%2 !=0) {
				System.out.println(b);
			}
			b++;
		}
		
		/* 다른방법
		int a=1;
		while(a<=100) {
			System.out.println(a);
			a+=2; // a=a+2;
		}           */
		
		
		// 1~100까지 짝수만 출력
		int c=1;
		while(c<=100) {
			if(c%2==0) {
				System.out.println(c);
			}
			c++;
		/* 다른방법
		int b=2;
		while(b<=100) {
			System.out.println(b);
			b+=2; // b=b+2
			}			*/      
		}
		}
	}
}
