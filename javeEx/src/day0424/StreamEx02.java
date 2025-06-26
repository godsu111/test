package day0424;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
	Reader 
		문자 스트림
		char(2바이트) 문자 단위(한글 포함)
*/
public class StreamEx02 {
	public static void main(String[] args) {
		// 파일 반드시 필요
		try{ // 예외 발생 코드
			Reader re =new FileReader("D:/godsu/output.txt"); // 문자 입력 스트림 생성
			int data;
			while((data = re.read()) !=-1) {	// 한 문자씩 읽기
				System.out.print((char)data);	// 문자로 출력
			}
			re.close();
			
		}catch(IOException e){
			System.out.println("파일 읽기 오류 : "+e.getMessage());
		}
	}
}


// InputStream , Reader // OutputStream, Writer