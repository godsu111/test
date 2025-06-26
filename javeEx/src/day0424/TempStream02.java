package day0424;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// Reader 입력 2바이트 문자 단위

public class TempStream02 {
	public static void main(String[] args) {
		try {
			Reader re = new FileReader("C:/godsu/temp.txt");
			int check;
			while((check = re.read())!=-1) {
				System.out.println((char)check);
			}
			re.close();
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다 : "+e.getMessage());
		}
	}
}
