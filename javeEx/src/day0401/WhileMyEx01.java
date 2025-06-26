package day0401;
//while문을 이용해 전체 구구단 출력
public class WhileMyEx01 {
	public static void main(String[] args) {
		int dan = 2; // 초기식
		while(dan<=9){ // 조건식
			System.out.println("["+dan+"단]"); // 실행문
			int i = 1; //초기식 
			while(i<=9) { //조건식
				System.out.println(dan+" X "+i+" = "+dan*i); //실행문
				i++; //증감식
			}
			dan++; //증감식
			System.out.println();
		}
	}
}
