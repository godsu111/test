package day0401;

public class Exam08 {
	public static void main(String[] args) {
		for(int a=1; a<=5; a++) { // 총 5층
			for(int b=1; b<a; b++) { // 공백표현
				System.out.print(" ");
			}
			for(int c=a; c<=5; c++) { // 별그리기
				System.out.print("*");
			}
			System.out.println("");// 줄바꿈
		}
	}
}
