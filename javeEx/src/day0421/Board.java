package day0421;
// 캡슐화
public class Board {
	// 변수
	private String title;	// 제목
	private String content;	// 내용
	private String writer;	// 글쓴이
	
	// 생성자 - 모든 변수의 초기화
	public Board(String title, String content, String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
	
	}
	// 메서드 - set() : 값 저장 , get() : 값 꺼내기
	// 접근제어자 리턴타입 메서드명(매개변수){구현코드}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
}
