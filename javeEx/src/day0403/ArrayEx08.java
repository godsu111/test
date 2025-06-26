package day0403;

public class ArrayEx08 {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		int[] scores = { 70, 85, 87, 90, 95 };
		
		// 총 합 구하기 - for문 
		int sum =0;
		for(int a=0; a<scores.length; a++) { //System.out.println(scores[a]); 
			sum +=scores[a];
		}
		System.out.println("for문의 합 : "+sum);
		
		// foreach문 사용
		    sum =0;
		for(int a : scores) { //System.out.println(a);
			sum +=a;
		}
		System.out.println("foreach문의 합 : "+sum);
	}
}
