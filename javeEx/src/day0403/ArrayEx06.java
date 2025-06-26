package day0403;

public class ArrayEx06 {
	public static void main(String[] args) {
		// 배열 선언 값 넣기 : 데이터타입[] 변수 = {값1, 값2, 값3};
		// [방개수] 생략 가능!
		
		// 6개의 요소를 가지고 있는 배열 1
		String[] str = { "apple", "banana", "grape", "melon", "kiwi", "tomato"};
		System.out.println(str);
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		System.out.println(str[5]);
		
		// 6개의 요소를 가지는 배열 2
		String[] str1 = new String[6];
		str1[0] = "apple";
		str1[1] = "banana";
		str1[2] = "grape";
		str1[3] = "melon";
		str1[4] = "kiwi";
		str1[5] = "tomato";
		
		// .length  : 길이, 개수, 크기등을 의미 -> 결과가 숫자
		// 인덱스[] : 순서. 0부터 시작
		System.out.println(str.length);
		System.out.println(str1.length);
		
		for(int i=0; i<str.length; i++) {  
			System.out.println(str[i]);
		}
		
		for(int i=0; i<str.length; i++) { 
			System.out.println(str1[i]);
		}
		
// 기본 for문  for(초기식; 조건식; 증감식){실행문;}
// foreach문  for( 자료형 변수명(변수선언) : 배열 또는 컬렉션(반복대상) ){실행문;}
//			 for( String s : str ){System.out.println(s);}	
		for(String s : str) {
			System.out.println(s);
		}
		for(String s : str1) {
			System.out.println(s);
		}
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//기본 for문
		for(int a=0; a<numbers.length; a++) {
			System.out.println(numbers[a]);
		}
		//foreach문
		for(int a  : numbers) {
			System.out.println(a);
		}
/*			
		for문     : 반복 횟수 지정 
		foreach문 : 반복 횟수를 지정하지 못함
				  반복 대상이 가지고 있는 데이터 수 만큼 반복.
*/	
	}
}
















