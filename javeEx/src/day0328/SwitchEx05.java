package day0328;

public class SwitchEx05 {
	public static void main(String[] args) {
		//switch 02 변형
		int score = 2;
		String str;
		score *= 100; // score = score*100
		str = "점수는 "+score+" 점이고, 상품은 : ";
		
		switch(score) {
			case 400:
				str += "TV,";
			case 300:
				str += "노트북,";
			case 200:
				str += "스마트폰,"; // str = "점수는 "+score+" 점이고, 상품은 : " + "스마트폰,"
			case 100:
				str += "이어폰";   // str = ""점수는 "+score+" 점이고, 상품은 : " + "스마트폰," + "이어폰"
				break;
			default:
				str +="꽝";
		}
		System.out.println(str+" 입니다.");
	}
}
