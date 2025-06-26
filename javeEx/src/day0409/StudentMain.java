package day0409;
/*
	캡슐화
		객체의 속성을 외부에서 직접 접근하지 못하게 막고 
		메서드를 통해서만 접근하게 함 
		
		변수 	private -> 외부에서 직접 접근 막음 
		메서드 	public 	-> 외부에서 간접 접근 허용
		
*/
class Student{ // 변수 생성자 메서드 순서
	// private  같은 클래스 내에서만 접근 가능 
	private int studentNumber;		// 학번
	private String studentName;		// 이름
	
	// set() / get()
	// 리턴타입 메서드명(매개변수,..){ 구현 코드 }
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	// public 리턴타입 x 메서드명 set(매개변수,..){구현코드}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
}


public class StudentMain {
	public static void main(String[] args) {
		// 객체 생성
		Student s = new Student();
//		s.studentnumber = 20250410;  private 접근제어자로 인해 변경 불가 
		
		// 클래스타입 참조변수명 = new 클래스();
		// 인스턴스 메서드 = 참조변수.메서드명();
		// set() 메서드로 값 저장
		s.setStudentNumber(20250410);
		
		// get() 메서드로 값 꺼내기
		int sNumber = s.getStudentNumber();
		System.out.println("학생의 학번 : "+sNumber);
		
		s.setStudentName("홍길동");
		String sName= s.getStudentName();
		System.out.println("학생의 이름 : "+sName);
	}
}






