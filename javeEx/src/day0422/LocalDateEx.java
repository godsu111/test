package day0422;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
	Date			단순한 시간, 날짜 객체
	LocalDate 		가장 직관적이고 안전한 API
	LocalDateTime	날짜+시간 모두 다룰 수 있음	

*/
public class LocalDateEx {
	public static void main(String[] args) {
		// 현재 날짜
		LocalDate today = LocalDate.now();
		System.out.println("오늘 날짜 : "+today);
		
		// 특정 날짜 생성
		LocalDate birth = LocalDate.of(2000, 1, 20);
		System.out.println("생년 월일 : "+birth);
		
		// 계산
		LocalDate day = today.plusDays(10); // 10일 후 날짜
		System.out.println("10일 후 날짜 : "+day);
		
		boolean be = birth.isBefore(today);
		System.out.println("생년월일이 오늘보다 이전이인가? : "+be);
		
		// 날짜 포맷
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
		System.out.println("현재 날짜와 시간 포맷 : "+now.format(format));
		
		
	}
}
