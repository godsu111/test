package day0415;
// Main 01
public class ExceptionEx00 {}
/*
	예외
		프로그램 실행 중에 발생할 수 있는 비정상적인 상황
		예) 0으로 나누기, 없는 파일 열기, null 값을 사용하려고 할 때
		예외 발생 시 프로그램이 종료 됨
		미리 안전하게 처리를 해야함
		
	예외 처리 방식
		try-catch 문으로 감싸준다
		try{
			// 예외 발생할 수 있는 코드
		}catch( 예외 타입 변수 ){
			// 예외 발생했을 때 실행 할 코드
		}finally { // 선택적사용
			// 예외 발생 여부에 상관 없이 반드시 실행
		}
	
	예외 종류(두 종류)
		일반 예외 - 체크 예외
			컴파일 시점에 예외 처리 강제
			try - catch , throws 로 처리해야함. 
			파일을 찾을 수 없을 때, 클래스를 찾을 수 없을 때
			
			
		실행 예외 - 언체크 예외  
			컴파일러가 예외 처리를 강제하지 않음
			대부분 실행 중 발생
			null 값 사용, 0으로 나누기....
	
	예외 처리가 필요한 이유
		예기치 않은 프로그램 종료 방지
		에러 메세지를 이해하기 쉽게 제공 
		안정적인 프로그램 흐름 유지
	
		
	예외 키워드
		try			{}	예외가 발생 할 수 있는 코드
		catch()		{}	예외 발생 시 실행 코드
		finally		{}	예외 발생 여부에 관계 없이 무조건 실행할 코드
		throw			직접 예외를 발생시킬 때 사용하는 키워드
		throws			메서드 선언부에서 예외를 떠넘길 때 사용 
		
		
	NullPointerException			null 객체를 사용하려고 할 때 
	ArrayIndexOutOfBoundsException	배열에서 인덱스의 범위를 벗어났을 때 
	NumberFormatException			숫자 형식이 아닌 문자열을 숫자로 변환하려 할 때
	ArithmeticException				수학 계산 오류가 발생 했을 때
	IOException						입출력 관련 오류 
	ClassNotFoundException			클래스를 찾을 수 없을 때
	ClassCastExcecption				클래스끼리의 형변환
*/