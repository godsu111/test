package day0417;

public class StringBuilder02 {
	public static void main(String[] args) {
		// 객체 생성
		StringBuilder sb = new StringBuilder();
		
		// .append()	: 문자열 끝에 매개값 추가/연결
		sb.append("자바 ");
		sb.append("프로그래밍 ");
		sb.append("짱잼.");
		String info = sb.toString();
		System.out.println(info);
		
		// .insert(index, 값)	: 왼쪽에 오른쪽 값을 넣겠다, 바꾸는게 아닌 추가
		sb.insert(1, "2");
		String info2 = sb.toString();
		System.out.println(info2);
		
		// .setCharAt(index, 값)	: 해당 index 번호의 값을 오른쪽 값으로 '변경'하겠다.
		sb.setCharAt(4,'A');
		System.out.println(sb.toString());
		
		// .replace( 시작, 미만, 변경값 ) :	시작부터 미만까지 변경값으로 대체
		sb.replace( 6, 13, "Book");
		System.out.println(sb.replace(6, 13, "Book"));
	
		// .length() 	: 문자열의 크기, 개수, 길이
		int length = sb.length();
		System.out.println("문자열의 길이 : "+length);
		
		// .toStrign()	: 객체의 정보 : StringBuilder 객체의 정보를 문자열로 리턴
		System.out.println(sb);
		System.out.println(sb.toString());
		// 위 아래 같음
		String result = sb.toString();
		System.out.println("sb 객체의 정보 : "+result);
	}
}
/*				변경 유무		스레드안전성	속도		
String			불변			안전 X 		보통		문자열 변경이 적을 때 사용
StringBuilder	변경가능(가변)	안전 X 		속도빠름	단일 스레드 환경
StringBuffer	변경가능(가변)	안전 O 		속도느림	멀티 스레드 환경
*/








