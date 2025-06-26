package day0425;

import java.io.FileInputStream;
import java.io.IOException;

public class Temp04 {
	public static void main(String[] args) {
		// 배열을 읽어보자
		try {
			FileInputStream fis = new FileInputStream("D:/godsu/gdcopy.txt");
			byte[] buffer = new byte[70];
			while(fis.read(buffer)!=-1) {
				System.out.println(new String(buffer).trim());
				
			}
		
		
		
		} catch (IOException e) {
			System.out.println("파일 읽기 오류 : "+e.getMessage());
		}
	
	}
}
