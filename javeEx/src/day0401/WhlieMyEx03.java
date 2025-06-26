package day0401;

/*사용자로부터 숫자 N과 M을 입력받아, 1부터 M까지의 숫자 중에서 N의 배수를 출력하는 프로그램을 작성하세요.
단, 배수가 5개 이상이면 출력을 멈추고 종료합니다 (break 사용). */

import java.util.Scanner;
public class WhlieMyEx03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력해주세요");
		int n= scanner.nextInt(); // n값 입력받기
		int m= scanner.nextInt(); // m값 입력받기
		int num = 1;
		int stop = 0;
		while(num<=m) { //1부터 m까지 숫자
			if(num%n==0) { //n의 배수
				System.out.println(num);
				if(m%5==0) { //5의 배수
					stop+=1;
					if(stop==5) {
						break;
					}
				}
			}
			num++;
		}
	}
}
