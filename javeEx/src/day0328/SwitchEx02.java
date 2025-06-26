package day0328;

public class SwitchEx02 {
	public static void main(String[] args) {
		int score = 3;
		switch (score * 100) {
			case 100 :
				System.out.println("점수는 100점");
				break;
			case 200 :
				System.out.println("점수는 200점");
				break;
			case 300 :
				System.out.println("점수는 300점");
				break;
			case 400 :
				System.out.println("점수는 400점");
				break;
			default :
				System.out.println("ㅠㅠ");
		}
	}
}









