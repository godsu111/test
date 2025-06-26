package day0403;

public class ArrayEx13 {
	public static void main(String[] args) {
/*
		가변 배열
		각 '행'이 다른 '길이'를 가지는 배열
		각 행의 열은 '개수'가 일정하지 않다 
		
		1 2 3
		4 5
		6 7 8 9
*/		int[][] arr= new int[3][];
		
		arr[0] = new int[] {1, 2, 3};
		arr[1] = new int[] {4, 5};
		arr[2] = new int[] {6, 7, 8, 9};
		
		
		// 가변 배열 값 출력 -for 문
		for(int a=0; a<arr.length; a++) {   // 행의 반복
			for(int i=0; i<arr[a].length; i++) { // 각 행의 열 반복
				System.out.print(arr[a][i]+" ");
			}
			System.out.println();
		}
		
		
		// 가변 배열 값 출력 - foreach 문
		for(int[] i : arr) {
			for(int b : i) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}


















