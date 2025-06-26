package day0401;

public class Exam07 {
	public static void main(String[] args) {
		for(int a=1; a<=5; a++) { //층
			for(int b=1; b<=5-a; b++) { //공백
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++) { //*그리기
				System.out.print("*");
			}
			
			System.out.println();
			}
	}
}
