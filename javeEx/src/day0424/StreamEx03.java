package day0424;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
	OutputStream
		프로그램 데이터를 외부로 바이트 단위로 출력할 때 사용
	write() : 1바이트 출력
	close() : 스트림 종료/닫기
*/
public class StreamEx03 {
	public static void main(String[] args) {
		// 파일이 없으면 자동 생성됨
		try {
			OutputStream os = new FileOutputStream("D:/godsu/output.txt"); // 파일 출력 스트림 생성
			os.write(65);	// A
			os.write(66);	// B
			os.write(67);	// C
			os.close();		// 스트림 닫기
		} catch (IOException e) {
			System.out.println("파일 쓰기 오류"+e.getMessage());	
		}
	}
}
