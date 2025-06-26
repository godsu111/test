package day0401;

public class WhileEx06 {
	public static void main(String[] args) {
		// 구구단
		// 2단만 출력
		int times=1;
		int dan=2;
		while(times<=9) {
			System.out.println(dan+" * "+times+" = "+dan*times);
			times++;
		}
	}
}
