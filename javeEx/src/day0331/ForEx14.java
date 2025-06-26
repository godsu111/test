package day0331;

import java.util.Scanner;

public class ForEx14 {
	public static void main(String[] args) {
		// 입력한 값이 양수라면 1부터 입력한값까지 출력
		Scanner scanner = new Scanner(System.in); // 값 입력받기
		System.out.println("양수를 입력해주세요 : ");
		int num = scanner.nextInt(); // int값을 입력받겠다.
		
		if(num>0) {
			for(int a=1; a<=num; a++) {
				System.out.print(a+" ");   // 1 2 3 4 5 6
			}
		}else { // 양수 아님
			System.out.println("양수가 아닙니다.");
		}
	}
}














