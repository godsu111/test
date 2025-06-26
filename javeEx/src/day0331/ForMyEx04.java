package day0331;

public class ForMyEx04 {
	public static void main(String[] args) {
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=5-a; b++) {
				System.out.print(" ");
			}
			for(int c=1; c<=2*a-1; c++) { //별 출력 갯수
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
	}
}
