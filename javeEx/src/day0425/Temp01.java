package day0425;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Temp01 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:/godsu/gd.txt");
			FileOutputStream fos = new FileOutputStream("D:/godsu/gdcopy.txt");
			int data;
			
			while((data=fis.read()) != -1) {
			//	System.out.println(data); 이렇게만 쓰게되면 숫자만나옴 우리가 보기위해 문자(char)로 변환 
				fos.write(data);
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료");
			
		} catch (IOException e) {
			System.out.println("파일 읽기 오류 : "+e.getMessage());
		}
	}
}
