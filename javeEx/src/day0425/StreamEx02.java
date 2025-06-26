package day0425;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
	read(byte[])	:	바이트 배열 읽기

*/
public class StreamEx02 {
	public static void main(String[] args) {
		try {
			InputStream fis = new FileInputStream("D:/godsu/gd.txt");
			byte[] buffer = new byte[70];	// 20 바이트 배열 생성
			
			// read(byte[]) : 최대 지정 크기 만큼만 읽어서 저장 
			// 실제 읽은 바이트의 수 
			int data = fis.read(buffer);
			// new String(byte[], 시작 인덱스 번호, 길이) -> 바이트 배열을 문자열로 반환
			System.out.println("내용 : "+new String(buffer, 0, data ));
			
			// 스트림 닫기
			fis.close();
			
		} catch (IOException e) {
			System.out.println("파일 읽기 오류 : "+e.getMessage());
		}
	}
}
