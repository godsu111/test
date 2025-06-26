package day0401;

public class Exam03 {
	public static void main(String[] args) {
		int start =1;
		for(int a=1; a<=5; a++) {
			for(int b=a; b<5+start; b++) {
				System.out.print(b);
			}
			System.out.println();
			start++;
		}
	}
}



/*
12345
23456
34567
45678
56789
*/