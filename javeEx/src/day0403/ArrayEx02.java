package day0403;

public class ArrayEx02 {
	public static void main(String[] args) {
		// 방의 개수가 3개인 배열 생성 3가지
		
		// 선언 후 대입 : new int[] 생략 불가
		int[] arr;		// 배열 선언
		arr = new int[] {1, 2, 3};	// 값 대입
		
		// 선언과 대입을 한번에
		// {} 안 개수만큼 초기화 -> [3] 방의 개수를 생략가능하다(new int[])
		int[] arr2 = {4, 5, 6};
		int[] arr3 = new int[] {7, 8, 9}; // new int[] 생략가능
		
	}
}
/*	변수 선언과 대입 방법
	1. 선언만 한 후 대입 따로 할때는 new int[] 필요함. 배열의 방 갯수를 모르기에
	2. 선언과 대입 한번에




*/