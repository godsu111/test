package day0401;

public class Exam05 {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		while(a<=5) {
			b=a;
			while(b<=5) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			a++;
		}
	}
}
