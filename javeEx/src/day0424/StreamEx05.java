package day0424;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
		Writer
			프로그램 데이터를 외부로 문자(char) 단위로 출력할 때 사용 스트림 
			텍스트 파일, 로그 등 출력할 때 사용
			한글, 개행문자( \n ) 출력 시 문자 스트림 사용!
		
		println() 줄바꿈
		
		write()	: 문자열 출력
		close() : 스트림 닫기
*/
public class StreamEx05 {
	public static void main(String[] args) {
		try {
//			Writer wi = new FileWriter("D:/godsu/output.txt");		 // 03 실행 후! 덮어쓰기
			Writer wi = new FileWriter("D:/godsu/output.txt", true); // 덮어쓰기말고 기존 내용 뒤에 이어쓰고 싶을떄
			wi.write(" 추가로 이어지는 내용~~~~~~~");
			wi.close();
		} catch (IOException e) {
			System.out.println("파일 쓰기/출력 오류"+e.getMessage());
		}
	}
}
