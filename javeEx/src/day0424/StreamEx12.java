package day0424;

import java.io.File;
import java.io.FileWriter;

public class StreamEx12 {
	public static void main(String[] args) {
		File f = new File("D:/godsu/input.txt");
		if(f.exists()) {
			f.delete();	// 시스템 접근 권한에 따라 가능/불가능 
			System.out.println("파일 삭제 완료");
		}
	}
}
