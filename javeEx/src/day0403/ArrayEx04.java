package day0403;

public class ArrayEx04 {
	public static void main(String[] args) {
		// 배열 선언
		// 타입[] 변수명; 변수명[인덱스번호] = 타입에 맞는 값;
		int[] arr;
		arr = new int[2]; // 방의 개수 지정
		arr[0] = 10;      // 대입
		// arr = 100;
		
		// 배열의 값 사용
		System.out.println( arr[0] );
		
		arr[0]++; // arr[0] = 11로 1증가
		System.out.println( arr[0] );
		System.out.println(arr[0]+10);     // 11 + 10 = 21
		System.out.println(arr[0]+arr[1]); // 11 + 0 = 11
		System.out.println(++arr[1]);	   // 1
		
		arr[1] = arr[0];
		System.out.println(arr[1]);
	}
}
