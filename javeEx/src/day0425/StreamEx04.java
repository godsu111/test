package day0425;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamEx04 {
	public static void main(String[] args) {
		// file 객체 생성
		// 파일 존재 유무를 떠나 무조건 file 객체를 리턴함
		File f = new File("D:/godsu/gd.txt");
		
		// 파일 존재 유무 학인
		if(!f.exists()) {
			System.out.println("파일이 없습니다.");
			return;
		}
		// 파일 존재 O, 파일 읽기( 입출력시 반드시 스트림 필요 )
		try {
			FileInputStream fis = new FileInputStream(f);
			// 파일에서 읽은 바이트 데이터를 저장할 변수
			int data;
			
			// read() : 파일에서 1바이트씩 읽고 더 이상 읽을게 없을경우 -1을 리턴한다
			while((data = fis.read()) != -1) {
				// char로 변환하여 출력
				System.out.println((char)data);
			}
			fis.close();
		
		
		} catch (IOException e) {
			System.out.println("파일 읽기 오류 : "+e.getMessage());
		}
	
	
	}
}
