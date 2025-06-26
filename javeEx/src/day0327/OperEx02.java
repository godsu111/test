package day0327;

public class OperEx02 {
	public static void main(String[] args) {
		// 증감연산자의 위치에 따른 순서
		// 변수 앞 (선증가/감소) - 1순위
		// 변수 뒤 (후증가/감소) - 마지막순위
		int a = 10;
		
		System.out.println(a++);   // 선출력(10) 후연산(11)
		System.out.println(++a);   // 선연산(12) 후출력(12)
		System.out.println(a++);   // 선출력(12) 후연산(13)
		System.out.println(a++);   // 선출력(13) 후연산(14)
		System.out.println(++a);   // 선연산(15) 후출력(15)
		a++;                       // 연산(16)
		System.out.println(++a);   // 선연산(17) 후출력(17)
		System.out.println(a);     // 출력(17)
		
		System.out.println("---------------------------------------");
		// --감소
		int b = 10;
		System.out.println(b--);   // 선출력(10) 후연산(9)
		System.out.println(--b);   // 선연산(8)  후출력(8)
		System.out.println(b--);   // 선출력(8)  후연산(7)
		System.out.println(b--);   // 선출력(7)  후연산(6)
		System.out.println(--b);   // 선연산(5)  후출력(5)
		b--;                       // 연산(4)
		System.out.println(--b);   // 선연산(3)  후출력(3)
		System.out.println(b);     // 출력(3)
		
		
	}
}










