package day0411;

class PersonP{
	String var1;
	
	void doit() {
		System.out.println("활동합니다.");
	}
	void doit1() {
		System.out.println("숨을 쉽니다.");
	}
}
class WorkerW extends PersonP{
	String var2;
	
	void doit2() {
		System.out.println("직장에 다닙니다.");
	}	
}
public class MainEx777 {
	public static void main(String[] args) {
		PersonP personp = new WorkerW(); // 자동 타입변환 자손 -> 부모
		WorkerW workerW = (WorkerW)personp; // 강제 타입변환 부모 -> 자식
		
		workerW.var1 = "10";
		workerW.var2 = "20";
		workerW.doit();
		workerW.doit1();
		workerW.doit2();
		// 강제 타입 변환, 부모 타입으로 자동변환된 객체를 다시 자식 타입으로 되돌린다.
		personp.var1 = "10";
//		personp.var2 = "20"; 부모가 가진 변수만 접근가능 
	
		
	}
}
