package day0425;

import java.io.FileOutputStream;
import java.io.IOException;

// 반복문 이용해서 값 쓰기
public class Temp09 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:/godsu/gdcopy.txt");
			for(int i=0; i<10; i++) {
				String line = "\tLine"+(i+1)+"\n";
				fos.write(line.getBytes());
			}
			fos.close();
		
			
		} catch (IOException e) {
			System.out.println("파일 쓰기 오류 : "+e.getMessage());
		}
	}
}
