package day0424;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
	BufferedReader	(보조 스트림 - 한 줄씩 읽기)
		파일의 텍스트를 한 줄 단위로 읽을 수 있음
		FileReader와 함께 사용, 성능 향상 효과 
		readLine()	: 한 줄 씩 읽음 String 타입 - null
		close()		: 스트림 닫기/종료
*/
public class StreamEx07 {
	public static void main(String[] args) {
		// BufferedReader 생성
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/godsu/input.txt"));
			
/*			Reader brr = new FileReader("D:/godsu/input.txt");
			BufferedReader bc = new BufferedReader(br);            */
			
			
			
			String line;
			while((line = br.readLine())!= null) { // 한 줄씩 읽기
				System.out.println(line); // 내용 출력
			}			
			br.close();		// 스트림 닫기
		} catch (IOException e) {
			System.out.println("BufferedReader 오류! "+e.getMessage());
		}
	}
}
