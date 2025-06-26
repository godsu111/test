package day0401;

public class WhlieMyEx02 {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		while(a<=5) {
			while(b<=a) {
				System.out.print("*");
				b++;
			}
			a++;
			b=1;
			System.out.println();
		}
	}
}
