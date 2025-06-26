package day0424;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
// BufferedReader 2바이트
public class TempStream07 {
	public static void main(String[] args) {
		try {
			Reader f = new FileReader("C:/godsu/temp.txt");
			BufferedReader bf = new BufferedReader(f);
			String line; // 
			while((line=bf.readLine()) != null) {
				System.out.println(line);
			}
			bf.close();
			
			
		} catch (IOException e) {
			System.out.println("BufferedReader 오류! : "+e.getMessage());
		}
	}
}
