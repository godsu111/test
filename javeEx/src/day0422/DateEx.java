package day0422;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		// Date 객체 생성
		Date day = new Date();
		System.out.println("현재 날짜와 시간 : "+day);
		
		// since January 1, 1970, 00:00:00 GMT
		long time = day.getTime();
		System.out.println("시간 : "+time); // 위 날짜로부터 현재시간까지 밀리초로 얼마나 흘렀나
		
		
	}
}
