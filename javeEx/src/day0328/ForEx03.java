package day0328;

public class ForEx03 {
	public static void main(String[] args) {
		// 1~100까지에서 홀수만 출력
		int a;
		for( a=1; a<=100; a++) {
			System.out.println(a);
			 }		
			 
			 //짝수 출력하기
			 
		for( int b=1; b<=100; b++) {
			if( b%2==0 ) {
				System.out.println(b);
			}
		}
	}
}

/*
		int a;
		for( a=1; a<=100; a+=2) { // a=a+2 : a+=2 
			System.out.println(a);
		}
  
  
*/
