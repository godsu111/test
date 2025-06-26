package day0424;

import java.util.Scanner;
/*
	Scanner (콘솔 입력)
		사용자의 키보드 입력을 프로그램으로 읽어올 때 사용
		다양한 타입으로 입력받을 수 있음
		nextInt() 와 nextLine() 	 함께 사용할 때 개행 문자 처리 필요함!
		close() : 스트림 닫기

	버퍼 ( Buffer )
		빠른 연산을 위해 데이터를 임시로 저장하는 공간.
		CPU, 메모리, 파일, 키보드 입력 등..
		
	Scanner 가 사용하는 버퍼
		입력 버퍼.
		System.in(키보드)으로 데이터를 읽을 때 입력 내용을 임시로 저장해두는 공간
*/
public class StreamEx06 {
	public static void main(String[] args) {
		// 콘솔 입력 스트림 생성
		Scanner s = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int t = s.nextInt();	// 정수 입력	10을 입력했을 때 10\n -> 10을 t에 대입하고 \n이 남아있음
		s.nextLine(); //입력버퍼 안에 남아 있는 개행 문자 제거		 \n이 꺼내짐
		String str = s.nextLine();	// 입력받음
		
		System.out.println(t+","+str);
	}
}
