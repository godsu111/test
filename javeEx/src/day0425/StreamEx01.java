package day0425;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
	FileInputStream(외부 -> 프로그램)
		파일에서 바이트 단위 데이터를 읽는 대표적인 클래스
		이미지, 이진 파일, 설정 파일 등 다양한 데이터 소스 읽기에 활용 됨
		read()		: 1바이트 또는 바이트 배열 읽기
		available() : 남은 바이트 수 확인
		close()		: 스트림 닫기/종료
		파일 없음 예외 주의 !


*/
public class StreamEx01 {
	public static void main(String[] args) {
		try {
			// FileInputStream 객체 생성( 파일 경로 지정 )
			InputStream fis = new FileInputStream("D:/godsu/gd.txt");
			
			// 파일에서 읽은 데이터를 저장할 변수
			int data;
			
			// read()	: 1바이트씩 읽고 더이상 읽을 게 없으면 -1 리턴
			while((data = fis.read())!=-1) {
				// 읽은 바이트를 char 로 변환하여 출력(문자로 보기 위해)
				System.out.print( (char)data);
			}
			
			// 파일을 사용 후 반드시 stream 닫기
			fis.close();
		} catch (IOException e) {
			System.out.println("파일 읽기 오류 : "+e.getMessage());
		}
	}
}
