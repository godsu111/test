package day0415;

interface Action{ // Action a = new AA();
	void execute();
}

public class MainEx04 {
	static void methodA(Action action) {
		System.out.println("동작 시작");
		action.execute();
		System.out.println("동작 끝");
	}
	public static void main(String[] args) {
// 		methodA();
//		methodA(new action() {});
//		methodA(new action() {public void excute(){} });
		
		methodA(new Action() {
			public void execute() {
				System.out.println("익명 객체로 매개변수 받아서 실행");
			}
		});

	}
}
