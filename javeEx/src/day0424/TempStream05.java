package day0424;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TempStream05 {
	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("C:/godsu/temp.txt",true);
			w.write("hello");
			w.write("안녕");
			w.write("write는 2바이트라");
			w.write("한글이랑 문자열 가능");
			w.write("다 작성했으면 close해주기");
			w.write("덮어쓰기가 싫다면 생성자 뒤 파일, true");
			w.close();
		} catch (IOException e) {
			System.out.println("파일 쓰기 실패 : "+e.getMessage());
		}
	}
}
