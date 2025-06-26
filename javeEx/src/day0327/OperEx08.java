package day0327;

public class OperEx08 {
	public static void main(String[] args) {
		int num = 10;
		int a = 2;
		boolean result = (num = num+10) > 10 && (a = a+2) < 10; 
						// 20 > 10 && 4 < 10  -> true
						// num += 10             a += 2
		System.out.println(result); //true
		System.out.println(num);    //20
		System.out.println(a);      //4
	}
}












