// 클래스 외부에 있을 수 있는 것은 패키지 선언과 임포트문 뿐이다.
package day0421;
// 임포트 - Lang 패키지를 제외한 모든 클래스, 인터페이스 사용 시 선언  
import java.util.List;
import java.util.ArrayList;


class Data{}

// List 인터페이스 - 순서 O, 중복 O, 인덱스 사용 가능 
public class ListEx01 {
	public static void main(String[] args) {
		// 가장 많이 사용하는 클래스 : ArrayList
		// 객체 생성
		List list = new ArrayList();			// 조상의 타입에 자손의 객체가 대입 : 다형성
		System.out.println("list 값 : "+list);  	// [] <- 배열
		
		// .add() : 값 넣기
		list.add(100);	// 정수 int 
		list.add("hello");	// 문자열 String 타입의 객체 hello
		list.add(new Data()); // Data 클래스의 객체
		System.out.println("list 값 넣은 후 : "+list); // ArrayList 클래스는 순서대로 저장되고 중복을 허용한다.
		
		list.add(100);
		list.add("hello");
		list.add(new Data()); // new로 새로운 객체 생성, 위의 list.add(new Data());와 다르다.
		System.out.println("중복 값 허용 : "+list);
		
		// 배열과 다르게 여러 타입의 값이 들어올 수 있다
		Data d = new Data();
		list.add(d);
		System.out.println("참조변수 d 넣기 : "+list); 
		
		// .add(index, value)	: index 에 value 넣기
		list.add(0,77); 
		System.out.println(list); // 해당 index 에 value 값이 들어가고 기존 값들이 뒤로 밀린다.
		
		// .set(index, value)	: index 에 value 값으로 변경
		list.set(0,700);
		System.out.println(list); // 해당 index 가 value 으로 수정(변경)됨.
		
		// .get(index)	: 지정된 index 의 값을 리턴한다
		Object obj =list.get(0);	// 처음 List 의 타입을 지정하지 않았기 때문에 Object 로 리턴타입을 받아줘야함
		System.out.println(obj);
		
		// .size()	: 저장된 개수 리턴
		int size = list.size();		
		System.out.println("list의 값의 개수 : "+size);
		
		// .remove(index)	: 지정된 인덱스의 값을 삭제
		list.remove(0);
		System.out.println("list의 0번째 값 삭제 : "+list); // 배열과 다르게 삭제된 인덱스를 채움
		
		int size2 = list.size();
		System.out.println("삭제 후 list의 값 개수 : "+size2);
	
		// .clear()	: 전체 삭제
		list.clear();
		System.out.println("list의 값 전체 삭제 : "+list);
		
	}
	
}























