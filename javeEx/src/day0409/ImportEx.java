package day0409;
/*
	패키지(package)
		자바에서 클래스들을 모아두는 폴더 역할 
		관련된 클래스들을 그룹으로 묶어서 관리 
		
	임포트(import)문
		기술이 아니고 편의를 제공하는 기능
		패키지가 다른 경우 클래스의 전체 이름을 적어서 사용해야 함.
		길고 귀찮기 때문에 간단하게 클래스 이름만 사용 가능하도록 import 기능 제공
		java.util.Scanner;
		*	: 전부/모든
		java.util.*; 	: 모든 클래스 의미
*/
import java.util.Date;
public class ImportEx {
	public static void main(String[] args) {
//		java.util.Date d = new java.util.Date();
//		java.util.Date d2 = new java.util.Date();
	
		Date day1 = new Date();
		Date day2 = new Date();
	
		System.out.println(day1.getDate());
		System.out.println(day2.toString());
	
	}
}




















