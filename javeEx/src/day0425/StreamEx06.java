package day0425;

import java.io.FileNotFoundException;
import java.io.*;

/*
	FileOutPutStream	출력 스트림(프로그램 -> 외부)
		파일에 바이트 단위 데이터를 출력하는 클래스 
		write()		: 1바이트 출력(문자 -> 아스키 코드)
		close()		: 스트림 닫기/종료
		같은 이름의 파일이 존재하면 내용을 덮어쓰기 함, 이어쓰기 가능(true)	
*/
public class StreamEx06 {
	public static void main(String[] args) {
		// FileOutPutStream 객체 생성
		try {
			// 이어쓰기	: 두번째 매개변수 값 true 지정
			FileOutputStream fos = new FileOutputStream("D:/godsu/gd.txt",true);
			// write() : 매개값에 int 값 -> 1바이트로 변환 후 출력
			// A - 65 
			fos.write(72); // 아스키 코드에 해당하는 값으로 변환 72
			
			// a - 97 
			fos.write(105);	// 아스키 코드에 해당하는 값으로 변환 105
			// 스트림 닫기
			fos.write('E');
			fos.close();
		}catch(IOException e) {
			System.out.println("파일 쓰기 오류 : "+e.getMessage());
		}
	}
}
