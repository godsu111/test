package day0417;

public class StringEx03 {
	public static void main(String[] args) {
		String s1 = "hello world";
		String s2 = " hello world ";
		String s3 = "HELLO WORLD";
		
		// .charAt(index)	: 인덱스에 위치한 문자 리턴
		char ca =s1.charAt(0);
		System.out.println("0번째 인덱스의 값 : "+ca);
		
		// .indexOf(문자)		: 문자의 위치(인덱스) 리턴
		int io = s1.indexOf('w');
		System.out.println("문자 w의 위치 : "+io);
		
		int io2 = s1.indexOf('k');
		// 인덱스의 시작은 0, 존재하지 않는 인덱스는 -1이라 표현
		System.out.println("문자 k는 존재하지 않음 : "+io2);
	
		// .lastIndexOf()	: 문자의 마지막 위치 리턴
		int li = s1.lastIndexOf('l');
		System.out.println("문자열 중 마지막에 위치한 l의 인덱스 번호 :"+li);
		
	    // .replace(왼, 오) 	: '왼'을 '오'로 바꾼 값 리턴
		String re = s1.replace('h', 'a');
		System.out.println("h를 a로 바꾼 값 : "+re);
		String re2 = s1.replace("hello", "hi");
		System.out.println("문자열 바꾼 값 : "+re2);
	
		// .toLowerCase() 	: 소문자로 바꿔서 리턴
		String tl = s3.toLowerCase();
		System.out.println("대문자 -> 소문자로 바꿔서 리턴 : "+tl);
		
		// .toUpperCase()	: 소문자를 대문자로 바꿔서 리턴
		String tu = tl.toUpperCase();
		System.out.println("소문자 -> 대문자로 바꿔서 리턴 : "+tu);
	
		// .substring(인덱스)	: 인덱스(포함)부터 끝까지 자른 부분 리턴
		String sub = s1.substring(6);
		System.out.println("6번 인덱스부터 자른 문자열 : "+sub);
		
		// .substring(index 포함, index 미만) : 포함 인덱스부터 미만 인덱스 앞까지 자른 부분 리턴
		String sub2 = s1.substring(6,9);
		System.out.println("인덱스 6포함 ~ 인덱스 9미만 : "+sub2);
		
		// .length() 	: 문자열의 개수
		int len = s1.length();
		System.out.println("s1 문자열의 개수 : "+len);
		
		// .trim()		: 앞 뒤 공백 제거한 후 리턴
		String tr=s2.trim();
		System.out.println("s2의 앞 뒤 공백 제거 : "+tr);
		System.out.println("s2의 원래 값을 출력 : " +s2);
		
		// .split()		: ()안의 값 기준으로 잘라낸 문자열 배열을 리턴
		String s4 = "java#html#css#html#spring";
		String[] arr = s4.split("#");
		
		// index 사용
		System.out.print(arr[0]+" ");
		System.out.print(arr[1]+" ");
		System.out.print(arr[2]+" ");
		System.out.print(arr[3]+" ");
		System.out.print(arr[4]+" ");
		System.out.println("");
		System.out.println("=========================");
		// for문 사용
		for(int a=0; a<arr.length; a++) {
			System.out.print(arr[a]+" ");
		}
		System.out.println("");
		System.out.println("=========================");
		
		// foreach문 사용
		for(String a : arr) {
			System.out.print(a+" ");
		}
		
	}
}
























