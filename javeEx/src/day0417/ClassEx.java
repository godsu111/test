package day0417;
// Class 클래스	- 자바에서 클래스 정보를 담은 클래스 
public class ClassEx {
	public static void main(String[] args) {
		// 클래스를 얻는 3가지 방법
		// 정적 로딩
		Class c1 = String.class;	 

		// 동적 로딩 - 반드시 예외 처리!
		Class c2 = "문자열".getClass(); // 다형성으로 사용가능 객체의 클래스가 궁금할 때
		
//		Class c3 = Class.forName("java.lang.String");
		
/*		Class c2 = c.getClass();
		String c = "문자열";
*/		
		try {
			// 예외가 발생할 수 있는 코드
			Class c3 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) { 
			// 예외 처리 코드
			e.printStackTrace();
		}
		System.out.println(c1.getName());		// 전체 이름
		System.out.println(c1.getSimpleName()); // 단순 이름 
		System.out.println(c1.isInterface());
	}
}
























