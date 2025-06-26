package day0414;

public class MainEx07 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		int result1 = calc.add(num1, num2);
		System.out.println("num1+num2 : "+result1);
		
		int result2 = calc.minus(num1, num2);
		System.out.println("num1-num2 : "+result2);
		
		int result3 = calc.multi(num1, num2);
		System.out.println("num1*num2 : "+result3);
		
		int result4 = calc.divide(num1, num2);
		System.out.println("num1/num2 : "+result4);
		calc.showInfo();
		
		Calc c = new CompleteCalc();
		c = calc;
		// c.showInfo(); 접근불가능 
	}
}
