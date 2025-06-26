package day0414;

public class CompleteCalc extends Calculator{
	public int multi(int num1,int num2) {
		int result = num1 * num2;
		return result;
	}
	public int divide(int num1, int num2) {
		if(num2 != 0 ) {
			return num1/num2;
		}
		else {// num2가 0 -> 나누는 수가 0인 경우 에러 리턴
			return Calc.ERROR;
		}
	}
	public void showInfo() {
		System.out.println("Calc 인터페이스 구현 완료");
	}	
}
