package day0423;

import java.util.function.Consumer;
/*
  	기본적으로 제공되는 표준 함수형 인터페이스들 
		java.util.function	패키지 안에 존재
	Consumer<> 인터페이스
		매개변수 O, 리턴 X
		void accept(T t)
		출력, 로그 남기기, 저장 등의 처리만 하는 경우
*/
public class LambdaEx05 {
	public static void main(String[] args) {
		Consumer<String> print = (msg) -> {System.out.println("출력 : "+msg);};
	
		print.accept("람다식 쏘 이지~");
	}
}
