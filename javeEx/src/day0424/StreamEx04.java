package day0424;

import java.util.Scanner;
/*
	개행문자
		줄을 바꾸기 위한 특수문자.
		자바에서 개행문자 표현 \n : 새로운 줄로 이동
	
	escape 문자
		원래 문자로 인식되지 않도록 탈출시켜주는 문자
		\(역슬래시)를 앞에 사용하며 특수한 기능을 수행하게 함
		
		\n		줄바꿈
		\t		탭(들여쓰기)
		\"		큰따옴표 출력
		\'		작은 따옴표 출력
		\\		역슬래시 출력
 */
public class StreamEx04 {
	public static void main(String[] args) {
		// \n
		System.out.println("Hello\nWorld");
	
		// \t
		System.out.println("hello\tworld"); // hello	world
	
		// \"
		System.out.println("\"Hello World\"");	// "Hello World"
		
		// \'
		System.out.println("\'Hello world\'"); // 'Hello world'
		System.out.println("'hello world'");
		
		// \\
		System.out.println("\\\\hello\\world\\\\");
		

	
	}
}































