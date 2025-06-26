package day0410;
/*
	super. / super()
		조상의 것을 의미
		 
	this. / this()
		객체 자신의 것을 의미
*/
class AAA{
	int x = 100;
}

class BBB extends AAA{
	int y = 200;
	int x = 300;
	
	void bbb() {
		int x = 500;					// 지역변수 
		System.out.println(x);			// 가까운 지역변수부터 사용...
		System.out.println(this.x);		// 자신의 변수
		System.out.println(super.x);	// 조상의 변수
	}
}
public class MainEx04 {
	public static void main(String[] args) {
		BBB b = new BBB();
		b.bbb();
		
	}
}
