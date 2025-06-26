package day0425;

import java.io.FileInputStream;
import java.io.IOException;

public class StreamEx05 {
	public static void main(String[] args) {
		try {
			// 바이트 단위 입력 스트림
			FileInputStream fis = new FileInputStream("D:/godsu/gd.txt");
			// 50 바이트 배열(버퍼) 생성
			// 한 번에 50 바이트씩 읽기 가능 -> 효율적으로 처리 가능!
			byte[] buffer = new byte[90];
			
			// .read(byte[]) : 더이상 읽을 것이 없으면 -1을 리턴한다 
			while(fis.read(buffer)!=-1) {
				// 바이트 배열 -> 문자열로 변환
				// .trim() : 문자열 앞뒤 공백 제거
				System.out.println(new String(buffer).trim());
			}
			// 스트림 닫기
			fis.close();
		} catch (IOException e) {
			System.out.println("파일 읽기 오류 : "+e.getMessage());
		}
	}
}
