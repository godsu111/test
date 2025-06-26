package day0425;

import java.io.FileOutputStream;
import java.io.IOException;

// 문자열 -> 바이트 출력 하려면 문자열을 바이트타입의 배열로 바꿔줌
public class Temp07 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:/godsu/gdcopy.txt");
			String str = "Hello Java";
			byte[] temp = str.getBytes();
			fos.write(temp);
			fos.write(str.getBytes());
			fos.close();
		
		
		} catch (IOException e) {
			System.out.println("파일 쓰기 오류 : "+e.getMessage());
		}
	}
}
