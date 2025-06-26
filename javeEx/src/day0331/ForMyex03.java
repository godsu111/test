package day0331;

import java.util.Scanner;

public class ForMyex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 값 입력받기
		System.out.println("N 층의 별 피라미드 : ");
		int num = scanner.nextInt(); // 값 입력받기
		
		for(int a=1; a<=num; a++) { // 현재 층번호
			for(int b=1; b<=num-a; b++) { //공백 출력 b=1 b<=7-1   
				System.out.print(" ");
			}
			for(int c=1; c<=2*a-1; c++) { //별 출력
				System.out.print("*");
			}
			System.out.println();//공백출력
		}
		
	}
}
