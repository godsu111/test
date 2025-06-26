package day0402;
/*
	배열
		- 자료형이 같은 데이터를 여러개 저장할 때 사용.
		- 데이터가 순차적으로 나열된 구조 : 순서가 있다.
		- 배열도 데이터 타입
		- 생성 시 값의 개수 지정
		
	배열 선언
		- 변수와 마찬가지 : 데이터 타입 변수명;
		- 데이터타입[] 배열명 -> int[] arr;
		  데이터타입 배열명[] -> int arr[];
*/	
public class ArrayEx02 {
	public static void main(String[] args) {
		//배열 선언
		int[] arr;          // 배열 선언, 변수와 같음
		arr = new int[3];   // 데이터가 몇개가 들어갈 것인지 지정해야함. -> 방
		System.out.println(arr);
		
		// 값 대입
		int a = 10; 
		a= 20;
		arr[0] = 10; // [0] 인덱스번호
		arr[1] = 20;
		arr[2] = 30;
		
		// 값 사용/읽기
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
