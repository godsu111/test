package day0424;

import java.io.File;
import java.io.IOException;

/*
	File 클래스
		파일 및 디렉토르 경로, 정보, 조작을 위한 클래스( 입출력 기능 없음 )
		
	exists()					: 존재 여부 확인
	isFile() / isDerectory()	: 파일/폴더 여부 확인
	getName(), getAbsoluteParh(), length()	
	mkdir(), delete(), renameTo(), listFiles()
*/
public class StreamEx10 {
	public static void main(String[] args) {
		// 파일이 존재하지 않을 때 
		try {
			File f = new File("D:/godsu/file1.txt");
			
			if(!f.exists()) { // 파일 존재 유무 확인
				System.out.println("파일이 존재하지 않습니다.");
				boolean created = f.createNewFile();	// 파일 생성
				if(created) {
					System.out.println("파일 생성 완료");
				}else {
					System.out.println("파일 생성에 실패했습니다.");
				}
			}
			System.out.println("파일이름 : "		+f.getName());	 	// 파일명
			System.out.println("파일의 절대 경로 : "	+f.getAbsolutePath()); // 절대경로
			System.out.println("파일의 크기 : "		+f.length()); 		// 파일크기 	
			
		} catch (IOException e) {
				System.out.println("오류 발생 : "	+e.getMessage());
		}
	}
}
	
