package day0424;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TempStream01 {
	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("C:/godsu/temp.txt");
			int data;
			while((data = is.read())!=-1) { // 
				System.out.println((char)data);
			}
			is.close();
			
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다");
		}
	}
}
