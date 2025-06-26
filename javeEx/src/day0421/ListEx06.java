package day0421;

import java.util.List;
import java.util.ArrayList;

public class ListEx06 {
	public static void main(String[] args) {
		// list 객체 생성
		List<Board> list = new ArrayList<Board>(); // 다형성
		
		// 값 넣기 : Board 객체 넣기
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		// .size()	: list가 가진 값의 개수
		int size = list.size();
		System.out.println("총 객체의 수 : "+size);
		System.out.println();
		
		// .get(인덱스) : 특정 인덱스의 값 꺼냄
		Board b = list.get(2);	// b로 접근한 것들은 : Board 의 인스터스 변수, 메서드
		String t = b.getTitle();
		String c = b.getContent();
		String w = b.getWriter();
		
		System.out.println("제목 : "+t+", 내용 : "+c+", 글쓴이 : "+w);
		
		System.out.println("===================================");
		
		// 모든 객체의 값 꺼내기
		// 기본 for 문
		for(int i=0; i<list.size(); i++) {
			Board bbb =list.get(i);
			String xx = bbb.getTitle();
			String yy = bbb.getContent();
			String zz = bbb.getWriter();
			System.out.println("제목 : "+xx+", 내용 : "+yy+", 글쓴이 : "+zz);
		}
		System.out.println("===================================");
		// foreach문
		for(Board bb : list) {
			String x = bb.getContent();
			String y = bb.getTitle();
			String z = bb.getWriter();
			System.out.println("제목 : "+x+", 내용 : "+y+", 글쓴이 : "+z);
			System.out.println(bb.getTitle()+"\t"+bb.getContent()+"\t"+bb.getWriter());
		}
		System.out.println("");
		
		// .remove(index) .remove(value) .removeAll(list)
		list.remove(2);	// index 2번 값 삭제
		Board bbbb = list.get(2); // 기존 index 3번값이 2번으로 당겨짐
		String str =bbbb.getTitle();
		System.out.println(str); 
		
		list.remove(2); // 삭제된 후 빈곳을 뒤의 값으로 채움
		list.removeAll(list);
		System.out.println(list);
	}
}

