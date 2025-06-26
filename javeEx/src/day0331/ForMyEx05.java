package day0331;

import java.util.Scanner;
// 입력받은 숫자까지의 합을 계산하고 출력
public class ForMyEx05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("N값을 입력하세요 : ");
		
		int a = scanner.nextInt(); //2
		int sum = 0;
			for(int b=1; b<=a; b++) { 
				sum+=b;
			}
			System.out.println("출력: 1부터 "+a+"까지의 합은 "+sum+"입니다.");
	}
}

