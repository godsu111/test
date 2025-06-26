package day0401;

public class Exam09 {
	public static void main(String[] args) {
		for(int a=1; a<=5; a++) {
			for(int c=a; c<=5; c++) {
				System.out.print(" ");
			}
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=1; a<=5; a++) {
			if(a==1) {
				continue;
			}
			for(int c=1; c<=a; c++) {
				System.out.print(" ");
			}
			for(int b=a; b<=5; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
