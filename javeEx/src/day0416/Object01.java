package day0416;
/*
	Object 클래스
		자바의 모든 클래스는 Object를 상속 받는다.
		Object의 모든 메서드를 상속받아 사용할 수 있다.
		
	.equals() - 객체를 비교하는 메서드
		기본 : 주소값 비교 
		값 비교 - 재정의 필요(오버라이딩)
*/
class Student{
	// 변수
	String studentName;	// 이름
	int studentId;		// 학번
	
	// 생성자 : 객체의 초기화 담당, 클래스명(매개변수,..){객체의 초기화 코드}
	Student(String studentName, int studentId){
		this.studentName = studentName;
		this.studentId = studentId;
	}
	// 메서드
	public boolean equals(Object obj) {
		if (obj instanceof Student) {	
			Student student = (Student)obj;
			if(studentId == student.studentId) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studentId+studentName.hashCode();
	}
	@Override
	public String toString() {
		String result = studentName+" "+studentId;
		return result;
	}
	
	
}

public class Object01 {
	public static void main(String[] args) {
		Student student1 = new Student("이경훈",16);
		Student student2 = new Student("이경훈",16);
		
		// ==
		System.out.println(student1 == student2); 		// false
		System.out.println(student1.equals(student2)); 	// true
		
		System.out.println("====================");
		// 동일한 주소값인지 비교
		if(student1 == student2) {
			// 조건의 결과가 true일 때
			System.out.println("student1과 student2의 주소는 같습니다.");
		}else { // false일 때
			System.out.println("student1과 student2의 주소가 다릅니다.");
		}
		
		// 동일한 객체인지 비교
		if(student1.equals(student2)) {	// 기본 : 주소값 비교
			System.out.println("student1과 student2가 동일합니다.");
		}else { // false일 때
			System.out.println("student1과 student2가 동일하지 않습니다.");
		}
		
		System.out.println("======================");
		// hashCode() 오버라이딩 후 확인!
		System.out.println("student1.hashCode() : "+student1.hashCode());
		System.out.println("student2.hashCode() : "+student2.hashCode());
		
		System.out.println("======================");
		String result = student1.toString();
		System.out.println(result);
	}
}