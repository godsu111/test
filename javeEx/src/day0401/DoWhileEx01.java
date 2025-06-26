package day0401;

public class DoWhileEx01 {
	public static void main(String[] args) {
/*
 	while문은 조건식 결과가 false 일 때 실행문 수행 안함. -> 반복 x
 	do-while문은 {}안의 실행부분을 반드시 한 번 실행함.
 	조건 검사 마지막.
 	반드시 실행할 코드가 있는 경우 사용
 */
		// 1~10까지의 합
		int num = 1;
		int sum = 0;
		do {
			sum +=num;
			num++;
		}while(num<=10);
		System.out.println("1~10까지의 합 = "+sum);
		
		int num2 = 8;
		do {
			System.out.println("do-while문");
			num2++;
		}while(num2==9);
			
	}
}











