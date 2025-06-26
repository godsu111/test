package day0403;

public class ArrayMyEx09 {
	public static void main(String[] args) {
		int[][] a= {{1,5,6},{7,8,9},{11,23,24}};
		
		for(int b=0; b<a.length; b++) {
			for(int c=0; c<a[b].length; c++) {
				System.out.print(a[b][c]+" ");
			}
			System.out.println();
		}
		
		for(int[] b : a) {
			for(int c : b) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
