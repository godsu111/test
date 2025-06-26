package day0425;

import java.io.FileInputStream;
import java.io.IOException;

// FileInputStream으로 배열 값 읽기 완
public class Temp05 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:/godsu/gdcopy.txt");
			byte[] buffer = new byte[99];
			int data;
			data=fis.read(buffer);
			System.out.println("내용 "+new String(buffer,0,data));
			fis.close();
			while(fis.read(buffer)!=-1) {
				System.out.println(new String(buffer));
			}
		
		} catch (IOException e) {
			System.out.println("파일 읽기에 실패 하였습니다 : "+e.getMessage());
		}
	}
}
