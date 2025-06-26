package day0331;

public class ForEx05 {
	public static void main(String[] args) {
		// 2단과 3단 출력하기
		for(int dan=2; dan<=3; dan++) { // 2~3단 반복
			for(int num=1; num<=9; num++) { // 곱해지는 수 1~9까지 반복
				System.out.println(dan+" X "+num+" = "+(dan*num));
			}
			System.out.println("=====");
		}
	}
}
