package day0331;

public class ForEx09 {
	public static void main(String[] args) {
		for(int a=1; a<=5; a++) {     //줄 반복
			for(int b=1; b<=a; b++) { //별 반복
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
