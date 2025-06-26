package day0416;
/*
	toString()
		객체(인스턴스) 정보를 문자열로 리턴하는 메서드
		기본형	: 인스턴스의 클래스이름과 주소값
				: @16진수의 해시코드 값
		상속 받은 클래스들은 미리 재정의를 한 클래스들이 많다.
				: 재정의된 메서드 호출
*/
class Book{
	String bookTitle; // 책 제목
	int bookNumber;	  // 책 번호
	
	// 생성자
	Book(String bookTitle, int bookNumber){
		this.bookTitle = bookTitle;
		this.bookNumber = bookNumber;
	}
	// 메서드

	@Override
	public String toString() {
		String result = bookTitle+","+bookNumber;
		return result;
	}
	
}

public class Object03 {
	public static void main(String[] args) {
		Book book = new Book("java", 2025);
		System.out.println(book);
		// ▲ book.toString() 자동 호출 ▲
		
		System.out.println("=============");
		String bookString = book.toString();
		System.out.println(bookString);
	}
}
