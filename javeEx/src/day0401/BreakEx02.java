package day0401;

public class BreakEx02 {
	public static void main(String[] args) {
		int num, sum=0;
		for( num=0; ; num++) { //조건식 생략 -> true 무한반복 
			sum+=num;
			if(sum>=100) {
				break;
			}
		}
		System.out.println("num의 값 : "+num);
		System.out.println("sum의 값 : "+sum);
	}
}
