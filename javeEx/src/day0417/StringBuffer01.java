package day0417;

public class StringBuffer01 {
	public static void main(String[] args) {
		// 객체 생성
		StringBuffer sb = new StringBuffer("hello");
		
		// .append()		: 문자열 끝에 추가
		sb.append(" java");
		System.out.println(sb.toString());
	
		// .insert(인덱스, 값)	: 삽입
		sb.insert(6, "world ");
		System.out.println(sb.toString());
		
		// .delete(시작, 미만)	: 시작부터 미만까지 특정 범위를 삭제
		sb.delete(5, 11);
		System.out.println(sb.toString());
		
		// .reverse()		: 문자열 뒤집음	
		sb.reverse();
		System.out.println(sb.toString());
		
		
		
	}
}












