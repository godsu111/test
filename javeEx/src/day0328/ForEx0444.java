package day0328;

public class ForEx0444 {
	public static void main(String[] args) {
		//구구단 
		int dan;
		int times;
		for( dan=1; dan<=9; dan++) {
			for( times=1; times<=9; times++ ) {
				System.out.println(dan+" * "+times+" = "+dan*times);
			}
			System.out.println("=======");
		}
		
	}
}