package day0417;
/*
	java.lang.StringBuilder 클래스, StringBuffer 클래스
		문자열을 변경하거나 연결할 때 사용
	  -String str = "hello";
			   str += " world";
					  "hello world"
					  
	  : String 객체 새롭게 생성!
	  - 공통점	: 내부에 버퍼( buffer: 데이터 임시 저장소 ) 존재
				문자열을 저장해두고 그 안에서 추가, 수정, 삭제 가능
				사용 방법 동일!
 	  - 차이점    : 여러 작업을 동시에 할 때
 	  			안전하게 보장하는지 하지 않는지 차이!(동기화 적용 유무)
	  - 안전 O   	: StringBuffer
*/
public class StringBuilder01 {
	public static void main(String[] args) {
		// 참조변수 -> 주소값 == .toString()
		
		String str = new String("java");
		System.out.println(str);
		System.out.println("str 문자열 주소 : "+System.identityHashCode(str));
		
		// StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		int sbIdentity = System.identityHashCode(sb);
		System.out.println("문자열 추가 전 sb 주소 : "+sbIdentity);
		
		// .append() : 뒤에 문자열을 추가해줌
		sb.append(" programing");
		sb.append(" is");
		sb.append(" fun!");
		System.out.println(sb);
		int sbIdentity2 = System.identityHashCode(sb);
		System.out.println("문자열 추가 후 sb 주소 : "+sbIdentity2);
		//	주소가 같다 -> 하나의 메모리에서 계속 연결된다는 것을 알 수 있음
		
		str = sb.toString();
		System.out.println(str.toString());
		System.out.println("새로 대입된 str 문자열 주소 : "+System.identityHashCode(str));
	}
}
