package day0401;
//사용자로부터 숫자 N을 입력받아, 다음과 같은 계단 모양의 별을 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class WhileMyEx04 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("N을 입력해주세요 : ");
		int n= scanner.nextInt();
		int a=1;
		while(a<=n) {
			int b=1;
			while(b<=a) {
				System.out.print("*");
				b++;
			}
			a++;
			System.out.println();
		}
		
	}
}
