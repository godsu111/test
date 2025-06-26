package day0417;

public class StringEx02 {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		// .length()	: 문자열에서 문자의 개수 얻을 때 사용
		int length = str.length();
		System.out.println(length); // 공백도 문자
		
		// .replace()	: 특정 문자열을 다른 문자열로 대체할 때 사용
		//				-> 새로운 문자열 객체가 생성되는 것, 원본 수정 불가능.
		String replace = str.replace("자바", "java"); // "java 프로그래밍" -> 새로운 객체를 가리키게됨
		System.out.println(replace);
		System.out.println(str);
		System.out.println(str.replace("자바","aa"));
		
		// .substring()	: 특정 위치의 문자열을 잘라서 가져올 때 
		// .substring(int 시작 index) : 시작 index부터 끝까지 
		// .substring(int 시작 index, int 마지막 index) : 시작포함 마지막 앞(미만) index까지
		String sub1 = str.substring(2);
		System.out.println(sub1);
		String sub2 = str.substring(1,5); // 1~4까지
		System.out.println(sub2);
		
		// .indexOf()	: 문자열에서 특정 문자열의 위치를 찾을 때 사용 
		int index = str.indexOf("프로그래밍");
		System.out.println(index);
		int index2 =str.indexOf("h");
		System.out.println(index2);	// 문자열에 없을 때 -1을 return 한다
		
		if( index == -1) {
			System.out.println("존재하지 않는 문자열입니다.");
		}else {
			System.out.println("존재하는 문자열입니다.");
		}
		
		// .contains()	: 단순 포함 여부를 확인할 때 사용
		boolean contains = str.contains(sub2);
		System.out.println(contains);
		if (contains) {
			// 포함
		}else {
			// 포함 X
		}
		
		// .split()		: 문자열을 분리할 때 사용
		String[] split =str.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		
		String str2 = "자 바 프 로 그 래 밍";
		String[] split2 = str2.split(" ");
		// 배열의 값 읽기
		// 1. 인덱스로 읽기
		System.out.println(split2[0]);
		System.out.println(split2[1]);
		System.out.println(split2[2]);
		System.out.println(split2[3]);
		System.out.println(split2[4]);
		System.out.println(split2[5]);
		System.out.println(split2[6]);
		System.out.println("===============");
	
		// 2. for문
		for(int a=0; a<split2.length; a++) { // for(초기식; 조건식; 증감식){실행문}
			System.out.println(split2[a]);
		}
		System.out.println("===============");
	
		// 3. foreach문
		for(String a : split2) { // for(타입 변수 : 반복대상){실행문}
			System.out.println(a);
		}
		
		String str3 = "사과,딸기,포도,복숭아,자두,수박,바나나";
		String[] tokens = str3.split(",");
		
		// 인덱스로 확인
		System.out.println(tokens[0]);
		
		// for문 사용
		for(int a=0; a<tokens.length; a++) {
			System.out.print(tokens[a]+" ");
		}
		System.out.println(" ");
		
		// foreach문 사용
		for(String a : tokens) {
			System.out.print(a+" ");
		}
	
	}
}









