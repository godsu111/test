package day0424;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	InputStreamReader 바이트를 문자로 변환
		바이트 기반의 스트림을 문자 기반의 스트림으로 변환
		인코딩 지정 가능( UTF-8, ... )
		read()	: 문자 단위 입력 int타입 -1
		close()	: 스트림 닫기/종료
*/
public class StreamEx08 {
	public static void main(String[] args) {
		// InputStreamReader 생성
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream("D:/godsu/input.txt"),"UTF-8"); // 인코딩 지정
			int ch;
			while((ch=isr.read())!= -1) {		// UTF-8로 인코딩한 문자 읽기
				System.out.print((char)ch); 	// 출력
			}
			isr.close();	// 스트림 닫기
		} catch (IOException e) {
			System.out.println("ISR 오류 : "+e.getMessage());
		}
	}
}