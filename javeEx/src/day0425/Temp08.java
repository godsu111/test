package day0425;

import java.io.FileOutputStream;
import java.io.IOException;

public class Temp08 { // close 메서드를 자동으로 쓰게 해주는 법
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("D:/godsu/gdcopy.txt")){
			byte[] data = {65,66,67};
			fos.write(data);
		
		
		} catch (IOException e) {
			System.out.println("오류 발생 : "+e.getMessage());
		}
	}
}
