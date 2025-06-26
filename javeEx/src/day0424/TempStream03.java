package day0424;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class TempStream03 {
	public static void main(String[] args) {
		// 출력 OutputStream, Writer
		try {
			OutputStream os = new FileOutputStream("C:/godsu/temp.txt");
			os.write(2); // 아스키코드에 맞는값
			os.write(3);	// 아스키코드에 맞는값
			os.write(999);	// 아스키코드에 맞는값
			os.close();
		} catch (IOException e) {
			System.out.println("파일 쓰기 오류 : "+e.getMessage());
		}
	}
}
