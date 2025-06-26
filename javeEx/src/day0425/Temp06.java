package day0425;

import java.io.FileOutputStream;
import java.io.IOException;

// 출력 스트림
// FileInputStream에서 write안에 바로 문자열을 넣을 수 없는 이유는 byte와 byte배열값만 받기때문

public class Temp06 {
	public static void main(String[] args) {
		// FileOutputStream 객체 생성
		try {
			FileOutputStream fos = new FileOutputStream("D:/godsu/gd.txt");
			fos.write(65);	// 아스키 코드에 해당하는 값 A 출력
			fos.write(66);	// 아스키 코드에 해당하는 값 B 출력
			fos.write(67); 	// 아스키 코드에 해당하는 값 C 출력
			fos.write('D'); // 문자 D 출력
			fos.close();
		
		} catch (IOException e) {
			System.out.println("파일 쓰기 오류 : "+e.getMessage());
		}
	}
}
