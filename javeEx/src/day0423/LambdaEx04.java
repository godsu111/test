package day0423;

interface Test{
	void show();
}
public class LambdaEx04 {
	public static void main(String[] args) {
		String name = "java";	// 람다 객체에서 사용할 때 변경이 불가, Final 변수처럼 작용
		
		// 람다식 내부에서 외부 변수 name 을 사용!
		Test t = () -> {
			System.out.println("이름 : "+name); // 읽기만 가능
		//	name = " "; 수정이 불가 
		};
		t.show();
	}
}
