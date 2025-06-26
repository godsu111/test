package day0408;
// Student - Bus - Subway
public class PublicTransport {
	public static void main(String[] args) {
		// 학생 객체 생성
		Student s1 = new Student("홍길동",10000);
		Student s2 = new Student("김이박",5000);
		
		// 버스 생성, 지하철 생성
		Bus bus = new Bus(100);
		Subway subway = new Subway("2호선");
		
		// 버스 탑승
		s1.takeBus(bus);	// s1이 버스 탑승
		s1.studentInfo();	// 
		bus.busInfo();
		
		// 지하철 탑승
		s2.takeSubway(subway);
		s2.studentInfo();
		subway.subwayInfo();
	}
}
