package day0401;

public class Exam02 {
	public static void main(String[] args) {
		int b;
		int start = 5;
		for(int a=1; a<=5; a++) {
			for(b= start; b<start+5; b++) {
				System.out.print(b);
			}
			System.out.println();
			start--;
		}
	}
}

/*
56789
45678
34567
23456
12345
*/