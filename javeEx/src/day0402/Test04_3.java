package day0402;

public class Test04_3 {
	public static void main(String[] args) {
		int a,b;
		for(a=1; a<6; a++) {
			for(b=1; b<=6-a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}





/*

3)
* * * * *
* * * *
* * *
* *
*

*/