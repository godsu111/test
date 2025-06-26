package day0425;

import java.io.FileOutputStream;
import java.io.IOException;

public class StreamEx09 {
	public static void main(String[] args) {
		// try-with-resources 	: 예외 발생 여부와 상관 없이 try 끝날때 자동으로 close()를 호출한다. 
		try(FileOutputStream fos = new FileOutputStream("D:/godsu/gd.txt")){
			// 바이트 배열 
			byte[] data = {65,66,67};
			
			// 바이트 배열 한번에 출력
			fos.write(data);
			
			// close() 호출 생략, 자동 호출됨!
			
		}catch(IOException e) {
			System.out.println("파일 쓰기 오류"+e.getMessage());
		}
	}
}
