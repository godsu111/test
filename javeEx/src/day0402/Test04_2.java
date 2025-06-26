package day0402;

public class Test04_2 {
	public static void main(String[] args) {
		int a,b;
		for(a=1; a<=5; a++) {  // 줄
			for(b=1; b<=a; b++) { // 별 그리기
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
/*
2)

* 
* *
* * *
* * * * 
* * * * *      

*/