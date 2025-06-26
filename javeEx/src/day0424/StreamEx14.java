package day0424;

import java.io.File;

public class StreamEx14 {
	public static void main(String[] args) {
		File srcDir = new File("D:/godsu/src");
		File[] files = srcDir.listFiles();
		
		if(files != null) {
			for(File f  : files) {
				System.out.println("파일 : "+f.getName());
			}
		}else {
			System.out.println("디렉토리를 찾을 수 없습니다.");
		}
	}
}
