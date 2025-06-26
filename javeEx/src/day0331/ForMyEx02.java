package day0331;

import java.util.Scanner;

public class ForMyEx02 { //구구단중 구할 단만 입력받아서 출력하기
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력할 단을 입력해주세요 : ");
		int dan = scanner.nextInt();
			for(int a=1; a<=9; a++) {
				System.out.println(dan+" X "+a+" = "+dan*a);
			}
	}
}