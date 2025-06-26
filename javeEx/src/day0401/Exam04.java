package day0401;

public class Exam04 {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		while(a<=5) {
			while(b<=a) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			b=1;
			a++;
		}
	}
}
