package day0331;

import java.util.Scanner;
//사용자로부터 숫자 N과 M을 입력받아 1부터 M까지의 숫자 중에서 N의 배수출력
public class ForMyEx06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("N 값을 입력하세요: ");
		System.out.println("M 값을 입력하세요: ");
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		for (int a=1; a<=m; a++) {
			if(a%n==0) {
				System.out.print(a+" ");
			}
		}
	}
}
