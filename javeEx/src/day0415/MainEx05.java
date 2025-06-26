package day0415;

interface Calculator {	// class A implements Calculator {}
	// 추상 메서드 
	int calculate(int x, int y);
}



public class MainEx05 {
	private int a;
	
	static Calculator getCalculator(){
		return new Calculator() {
			public int calculate(int x, int y) {
				return x+y;
			}
		};
	}
	public static void main(String[] args) {
		Calculator culc =getCalculator();
		
		
		int result = culc.calculate(10, 5);
		System.out.println(result);
	}
}
