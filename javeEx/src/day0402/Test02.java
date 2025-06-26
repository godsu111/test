package day0402;

public class Test02 {
	public static void main(String[] args) {
		//03. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 코드를 작성해보세요.
		//힌트) break문 사용
		
		int dan;
		int num;
		for( dan=1; dan<=9; dan++) {
			for( num=1; num<=9; num++) {
				if( num > dan ) {
					break;
				}
				System.out.println(dan+"x"+num+"="+dan*num);
			}
			System.out.println();
		}
	}
}
