package day0425;
import java.io.*;
public class StreamEx08 {
	public static void main(String[] args) {
		
		try {// 이어쓰기("파일명",true) : append() = true
			FileOutputStream fos = new FileOutputStream("D:/godsu/gd.txt",true);
			
			// 추가 할 문자열 
			String line = "\n\tAppend This Line";
			
			// 바이트로 변환 후 출력
			fos.write(line.getBytes());
			
			// 스트림 닫기/종료
			fos.close();
		} catch (IOException e) {
			System.out.println("출력 오류 : "+e.getMessage());
		}
		
	}
}