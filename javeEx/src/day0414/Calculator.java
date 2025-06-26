package day0414;

public abstract class Calculator implements Calc{
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	public int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
}
