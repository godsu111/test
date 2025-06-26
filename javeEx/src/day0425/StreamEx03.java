package day0425;
// available() : 남은 바이트 수, 전체 데이터가 아직 도착하지 않았을 경우에는 정확하지 않음

import java.io.FileInputStream;
import java.io.IOException;

public class StreamEx03 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:/godsu/gd.txt");
			System.out.println("남은 바이트 수 : "+fis.available());
			fis.close();
		
		
		
		} catch (IOException e) {
			System.out.println("파일 정보 읽기 오류 : "+e.getMessage());
		}
	}
}
