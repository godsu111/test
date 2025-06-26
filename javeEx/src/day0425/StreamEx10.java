package day0425;

import java.io.FileOutputStream;
import java.io.IOException;

public class StreamEx10 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:/godsu/gd.txt");
			
			// 반복문 사용
			for(int i=0; i<10; i++) {
				// 반복할 문자열 생성
				String line = "Line "+(i+1)+"\n";	// Line 1 줄바꿈 후 Line 2 .... Line 5 
				
				// 문자열을 배열로 변환 출력
				fos.write(line.getBytes());
			}
			// 스트림 닫기
			fos.close();
		
		
		} catch (IOException e) {
			System.out.println("파일 출력 오류 : "+e.getMessage());
		}
	}
}

