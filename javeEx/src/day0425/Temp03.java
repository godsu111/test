package day0425;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Temp03 {
	public static void main(String[] args) {
		// 파일 객체 생성
		File f = new File("D:/godsu/gdcopy.txt");
		// 파일 존재 유무 확인
		if(!f.exists()) {
			System.out.println("파일이 존재하지 않습니다.");			
		}
		// 파일이 존재하니  읽어보기
		try {
			FileInputStream fis = new FileInputStream(f);
			int data;
			while((data=fis.read())!= -1) {
				System.out.println((char)data);
			}
			
			
			
		} catch (IOException e) {
			System.out.println("파일 읽기 오류 : "+e.getMessage());
		}
		
	}
}
