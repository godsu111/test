package day0331;

public class ForEx07 {
	public static void main(String[] args) {
		int dan;
		int num;
		for(dan=2; dan<=9; dan++) {
			System.out.println(dan+"단");
			for(num=1; num<=9; num++) {
				System.out.println(dan+" X "+num+" = "+dan*num);
			}
			System.out.println();
		}
	}
}
