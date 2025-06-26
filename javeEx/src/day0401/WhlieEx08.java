package day0401;

public class WhlieEx08 {
	public static void main(String[] args) {
		int dan = 2;
		while(dan<10){
			int num = 1;
			while(num<10) {
				System.out.println(dan+" X "+num+" = "+dan*num);
				num++;
			}
			dan++;
			System.out.println();
		}
	}
}
