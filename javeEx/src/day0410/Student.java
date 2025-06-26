package day0410;
// MainEx06에서 실행 
/*
	super();
		- 생략하면 컴파일러가 자동으로 추가해줌 
		- 조상의 기본 생성자가 반드시 존재해야함.
		- 매개변수가 있는 생성자가 있을 경우 
		반드시 매개변수가 있는 생성자를 호출해야함. 

*/
public class Student extends People{	// 자손
	// 변수
	int studentNo;
	
	Student(String name, String peopleNo, int studentNo){
		super(name, peopleNo);		// 기본 생성자 없음, 반드시 다른 생성자를 호출해야한다
		this.studentNo = studentNo;
	}
}
