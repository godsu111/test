package day0424;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
  	자동 임포트 추가 단축키 : 컨트롤 쉬프트 O
	
	입력 스트림
		외부 데이터 -> 프로그램안으로 읽어 들어올 때 사용
		InputStream : 바이트 단위 처리
		Reader		: 문자 단위 처리
		close() 로 사용 후 스트림 닫기
		
		read() 	: 1바이트 또는 1문자씩 읽음 더이상 읽을게 없으면 -1을 반환함
		close() : 스트림 종료
*/
public class StreamEx01 {
	public static void main(String[] args) {
		// 파일 반드시 필요!		FileNotFoundException 발생 할 수 있음
		try { // 예외 발생 코드
			InputStream is = new FileInputStream("D:/godsu/input.txt");
			int data;
			while( (data = is.read()) !=-1) { // -1 : 더이상 읽어들일게 없다
				System.out.println((char)data); // 1바이트, 1문자라 하나씩 출력된다 H,e,l,l
			}
			is.close();	// 스트림 닫기
		} catch (IOException e) { // 예외타입  변수
			System.out.println("파일 읽기 오류 "+e.getMessage()); // 어떻게 처리 할 것인지
		}
	
	
	}
}
