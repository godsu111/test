package day0331;
//별 계단 만들기 숫자 N 입력받고 계단만들기
import java.util.Scanner;

public class ForMyEx07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("N= ");
		int n=scanner.nextInt();
		
		for(int a=1; a<=n; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
