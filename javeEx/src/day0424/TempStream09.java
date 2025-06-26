package day0424;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TempStream09 {
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:/godsu/temp.txt"));
			bw.write("얘는 2바이트라 한글 가능하지롱");
			bw.write("숫자도 가능");
			bw.newLine();
			bw.write(65);
			bw.close();
		
		} catch (IOException e) {
			System.out.println("bw쓰기 오류 : "+e.getMessage());
		}
	}
}
// BufferedWriter 보조스트림 
// 파일에 한글자씩 쓰지않고 버퍼에 모았다가 한꺼번에 출력 -> 처리속도 빠름 많은 문자 데이터를 효과적으로 출력가능하다.