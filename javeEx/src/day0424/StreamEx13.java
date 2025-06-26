package day0424;

import java.io.File;

public class StreamEx13 {
	public static void main(String[] args) {
		File oldfile = new File("D:/godsu/file2.txt");	
		File newFile = new File("D:/godsu/newFile.txt");
		
		if(oldfile.renameTo(newFile)) {
			System.out.println("파일 이름 변경 성공!");
		}
		else {
			System.out.println("파일 이름 변경 실패!");
		}
		File dir = new File("D:/godsu/src");
		if(!dir.exists()) {
			dir.mkdir();	// 폴더 생성
			System.out.println("폴더 생성 완료!");
		}
		
	}
}

















