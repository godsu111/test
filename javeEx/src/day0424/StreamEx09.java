package day0424;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
	BufferdWriter	(버퍼기능 가진 출력 스트림)
		Writer 의 보조 스트림
		데이터를 버퍼에 모았다가 한번에 출력
		파일에 한 글자씩 바로 쓰지 않고 저장소(버퍼)에 모았다가 한꺼번에 출력 -> 속도가 빠르다
		많은 양의 문자 데이터를 효율적으로 출력할 수 있음
		
		write()		: 문자열 출력 
		newLine() 	: 개행 출력, 줄바꿈을 하고 싶을 때 사용 
		flush()		: 출력
		close()		: 스트림 닫기 / 종료  
*/
public class StreamEx09 {
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:/godsu/output.txt"));
			bw.write("성능 향상 시키는 보조 스트림");		// 버퍼에 저장(파일에 바로 쓰지 않는다)
			bw.write("버퍼에 모았다가 한번에 출력한다.");		// 버퍼에 저장(버퍼가 가득 찼거나, 파일을 닫을 때 한꺼번에 써짐)
			bw.close();	// 스트림 닫기		
		} catch (IOException e) {
			System.out.println("bw 오류 : "+e.getMessage());
	
		}	
	}
}