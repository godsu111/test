package day0425;

import java.io.*;
// 문자열 -> 바이트배열 출력
public class StreamEx07 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:/godsu/gd.txt");
			// 출력할 문자열 생성
			
			String str = "Hello Java IO";
			// .getBytes() : 문자열을 바이트 배열로 변환 리턴
			
			byte[] bytes = str.getBytes();
			// 바이트 배열 전체를 파일에 출력
			fos.write(bytes);
			fos.close();
			
			
		} catch (IOException e) {
			System.out.println("파일 출력 오류 : "+e.getMessage());
		}
	}
}
