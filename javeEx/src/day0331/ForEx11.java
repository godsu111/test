package day0331;

public class ForEx11 {
	public static void main(String[] args) {
		int a;
		int b;
		for(a=1; a<=5; a++) {
			for(b=1; b<=a; b++) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
