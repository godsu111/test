package day0410;
// Phone - TvPhone 클래스
public class MainEx05 {		// 실행 클래스
	public static void main(String[] args) {
		TvPhone t = new TvPhone("삼성 S25","검정",7);
		
		// 상속받은 변수
		System.out.println("모델 : "+t.model);
		System.out.println("색상 : "+t.color);
		// 자손의 변수
		System.out.println("채널 : "+t.channel);
		
		t.powerOn(); // 메서드호출 참조변수.메서드(); 오버라이딩 메서드
		
		// 오버라이딩 안한 메서드 
		t.bell();
		t.sendVoice("여보세요.");
		t.receiveVoice("안녕하세요, 자바입니다.");
		t.sendVoice("반갑습니다.");
		t.hangUp();
		
		// 자손의 메서드 
		t.changeChannel(9);
		
		// 오버라이딩 메서드
		t.powerOff(); 
	}
}