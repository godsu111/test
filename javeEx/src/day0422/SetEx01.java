package day0422;
// set - 객체의 주소를 기준으로 중복 판단 equals(), hashCode(); 재정의 필요 -> 중복 허용 X 
import java.util.Set;
import java.util.HashSet;

class Test{
	// 인스턴스 변수
	int id;
	
	
	// 생성자
	Test(int id){
		this.id = id;
	}
	// id 값을 기준으로 변경
	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}
	
	// id 값이 같으면 같은 객체
	@Override
	public boolean equals(Object obj) {	
		// 메서드의 결과를 담을 변수를 미리 선언
		boolean result = false;
		
		if( obj instanceof Test) {
			result=(this.id==((Test) obj).id); // true
			return true; 
		}
		return result; // false	
	}	
}

public class SetEx01 {
	public static void main(String[] args) {
		// 객체 생성 - 타입 지정 : Test 객체만 들어갈 수 있음.
		Set<Test> set = new HashSet<Test>();
		set.add(new Test(10));
		set.add(new Test(10));
		System.out.println(set); // 중복 객체 확인

		set.add(new Test(20));
		int size = set.size();
		System.out.println("개수 : "+size); // 2
	}
}

















