package day0424;import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TempStream11 {
	public static void main(String[] args) {
		try {
			File f = new File("C:/godsu/file22.txt");
			FileWriter fw = new FileWriter(f);
			fw.write("파일 생성 확인!\\n이 파일은 자바로 생성되었습니다."); 
			f.delete(); // 파일생성
			fw.close();
			System.out.println(f.exists());
		} catch (IOException e) {
			System.out.println("오류 발생 : "+e.getMessage());
		}
				
	}
}
