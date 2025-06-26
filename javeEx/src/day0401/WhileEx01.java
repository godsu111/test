package day0401;

public class WhileEx01 {
	public static void main(String[] args) {
/* 		while문 
        조건식이 참(true)인 동안 실행문 반복 수행  
        
        while(조건식){
        	실행문;
        	증감식;
        }
 
 */     // 1부터~10까지 출력 while
		int a = 1;     // 초기식
		while(a<=10) { // 조건식
			System.out.println(a); // 실행문
			a++;       // 증감식
		}
	}
}
