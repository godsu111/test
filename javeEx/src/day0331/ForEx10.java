package day0331;

public class ForEx10 {
	public static void main(String[] args) {
		for( int a=5; a>=1; a--) {        //줄 ( 5->1)
			for( int b=1; b<=a; b++) {    //별 (a~1)
				System.out.print("*");
			}
			System.out.println();
		}
		}
}
/*
		int a;
		int b;
		for(a=1; a<=5; a++) {
			for(b=a; b<=5; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	

*/
