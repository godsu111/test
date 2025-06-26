package day0424;

import java.util.Scanner;

// Scanner와 입력버퍼는 짝궁 System.in 키보드로 입력하는 데이터 내용일 임시로 저장
public class Tempstream06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("입력해주세요 : ");
		int a = s.nextInt(); 
		s.nextLine();
		String b = s.nextLine(); // 문자열을 받음 
		
		System.out.println(a+","+b);
	}
}
/*
int a = s.nextInt(); 
String b = s.nextLine(); // 문자열을 받음 
이렇게만 사용하면 s.nextInt()에 사용자의 입력값과 개행문자가 입력 버퍼에 저장되는데
그 중 int a에 입력값만 들어가고 \n 개행문자가 남아있게된다
따라서 String b에 남은 \n 개행문자가 바로 들어가버려서 
사용자지정 입력값을 입력하지 못하니 개행문자 처리를 해주기 위해
s.nextLine()을 해서 개행문제를 제거한다
그럼 





*/