package day0415;

class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}

public class Main10 {
	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (MyException e) {
			System.out.println("예외 발생 : "+e.getMessage());
		}
	}
	
	public static void checkAge(int age) throws MyException{
		if(age < 20) {
			throw new MyException("20세 미만은 접근할 수 없습니다.");
		}else {
		System.out.println("접근을 허용합니다.");
		}
	}
}
