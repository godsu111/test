package day0403;

public class ArrayEx07 {
	public static void main(String[] args) {
		String[] cutes = { "dog", "cat", "rabbit", "racoon", "panda", "bear" };
		for(int i=0; i<cutes.length; i++) {
			String cute = cutes[i];
			System.out.println(cute+" 를 만났습니다.");
		}
		// 숫자 :  형태로 출력!
		int[] numbers = {1, 2, 3, 4, 5};
		for(int a : numbers) { // foreach문 for (타입 변수명 : 반복대상) {실행문;}
			System.out.println("숫자 : "+a);
		

		}
	}
}
