package day0403;

public class ArrayEx12 {
	public static void main(String[] args) {
/*
 		2차원 배열
 		표(테이블) 처럼 행과 열로 이루어진 배열.
 					행 : row
 					열 : column
 		int[행 개수][열 개수]
 		int[3][3]
*/
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		// 2차원 배열 값 출력 - for문 
		for( int i=0; i<arr.length; i++) {
			for( int j=0; j<arr[i].length; j++) {
				System.out.print( arr[i][j]+" ");
			}
			System.out.println();
		}
		// 2차원 배열 값 출력 - foreach문
		for(int[] a : arr) { // {1,2,3},{4,5,6},{7,8,9}
			for(int b : a) { // 배열의 값
				System.out.print(b);
			}
			System.out.println();
		}
	
	
	}
}
