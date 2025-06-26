package day0401;
//사용자로부터 숫자 N을 입력받아, while문을 사용하여 1부터 N까지의 합을 계산하고 출력하는 프로그램을 작성하세요.//
import java.util.Scanner;
public class WhileMyEx02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("N값을 입력하세요 : ");
		int a=scanner.nextInt();
		int sum=0;
		int x=0;
		while(x<=a) {
			sum+=x;
			x++;
		}
		System.out.println(sum);
	}
}
