package day0424;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TempStream08 {
	public static void main(String[] args) {
		
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream("C:/godsu/temp.txt"));
			int ch;
			while((ch=isr.read())!=-1) {
				System.out.println((char)ch);
			}
			isr.close();
		} catch (IOException e) {
			System.out.println("ISR 오류 : "+e.getMessage());
		}
	}
}
