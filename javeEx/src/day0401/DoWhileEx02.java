package day0401;

import java.util.Scanner;

public class DoWhileEx02 {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String input;  // 입력값 담을 변수
		
		do {
			System.out.print(">");
			input = scanner.nextLine(); // 입력받음
			System.out.println(input);
		}while( !input.equals("q") );
		System.out.println();
		System.out.println("프로그램이 종료되었습니다.");
	}
}
