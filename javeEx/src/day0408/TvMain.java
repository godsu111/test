package day0408;

public class TvMain {
	public static void main(String[] args) {
		// 객체(인스턴스) 생성
		// 클래스타입 변수명 = new 클래스명();
		Tv t; 			// 참조 변수 선언홓ㅎㅎ해ㅐㅐㅐ5689
		t = new Tv(); 	// 객체(인스턴스) 생성
		
		// 인스턴스 메서드 사용(호출) => 참조변수.메서드();
		// tv 켜고 채널 올리고*3 채널 내리고 값 변경(대입) 채널 값 출력
		
		System.out.println("실행 전 channel : "+t.channel+", power : "+t.power);
		t.power();    		// tv 켜기 기본값 false 에서 !false - > true
		System.out.println("실행 후 power 값 : "+t.power);
		t.channelUp();		// 채널 올리기 +1만큼
		System.out.println("실행 후 channel 값 : "+t.channel);
		t.channelUp();		// 2
		System.out.println("실행 후 channel 값 : "+t.channel);
		t.channelUp();		// 3
		System.out.println("실행 후 channel 값 : "+t.channel);
		t.channelUp();      // 4
		t.channelDown();    // 4-1 = 3
		System.out.println("현재 채널은 : "+t.channel+"번입니다.");
		t.power(); 			// false로 바뀜
		System.out.println("전원은 "+t.power+"상태입니다.");
		

		t.channel = 10;
		System.out.println(t.channel);
	}
}
