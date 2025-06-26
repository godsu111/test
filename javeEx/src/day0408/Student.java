package day0408;

public class Student {	// 학생
	// 인스턴스 변수
	String studentName; // 학생 이름
	int money;			// 학생이 가진 돈
	
	// 생성자
	Student(String studentName, int money){
		this.studentName=studentName;
		this.money=money;
	}
	
	// 버스 탑승, 요금 = 1000원
	void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	// 지하철 탑승, 요금 = 1500원
	void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	// 학생 정보
	void studentInfo() {
		System.out.println(studentName+"님의 남은 돈은 "+money+"원 입니다.");
	}
}














