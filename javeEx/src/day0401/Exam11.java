package day0401;

public class Exam11 {
	public static void main(String[] args) {
		 int rows = 5; // 트리의 층수

	        // 각 층을 출력
	        for (int i = 1; i <= rows; i++) {
	            // 공백 출력 (왼쪽 정렬)
	            for (int j = i; j < rows; j++) {
	                System.out.print(" ");
	            }
	            // 별 출력
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println(); // 줄 바꿈
	        }
	    }
	}