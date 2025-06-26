package day0424;

import java.io.File;
import java.io.IOException;

public class TempStream10 {
	public static void main(String[] args) {
		try{
			File f= new File("C:/godsu/temp.txt1");
			if(!f.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				boolean craft = f.createNewFile();
				if(craft) {
					System.out.println("파일을 생성했습니다.");
				}else {
					System.out.println("파일 생성에 실패했습니다.");
				}	
			}		
		}catch(IOException e){
			System.out.println("오류 발생 : "+e.getMessage());
		}
		

	}
}
