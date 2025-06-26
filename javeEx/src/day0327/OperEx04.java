package day0327;

public class OperEx04 {
	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		y = x++;                     // 대입 연산, 후증가 y=5 , x= 6
		System.out.println(x+","+y); // 6,5
		
		x = 5;
		y = 0;
		y = ++x; // 대입 연산, 선증가 x=6 , y=6
		System.out.println(x+","+y); //6,6
	}
}
