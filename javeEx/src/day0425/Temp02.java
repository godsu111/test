package day0425;

import java.io.FileInputStream;
import java.io.IOException;

// byte[] 배열 읽기 read(byte[]), 읽는건 Reader InputStream 등등
public class Temp02 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:/godsu/gdcopy.txt");
			byte[] buffer = new byte [30]; // 방크기 30
			int data =fis.read(buffer);
			System.out.println("내용 "+new String(buffer, 0, data));
			fis.close();
		} catch (IOException e) {
			System.out.println("파일 읽기 오류 : "+e.getMessage());
		}
	}
}
