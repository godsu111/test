package day0328;

public class SwitchEx06 {
	public static void main(String[] args) {
		int score = 88;
		char grade; // default 때문에 grade 값을 정의하지 않아도 오류가 발생하지않음.
		switch( score ) {
			case 100 : case 99 : case 98 : case 97 : case 96 : case 95 : case 94 : case 93 : case 92 :
			case 91 : case 90 :
				grade='A';
				break;
			case 89 : case 88 : case 87 : case 86 : case 85 : case 84 : case 83 : case 82 : case 81 : case 80 :
				grade='B';
				break;
			default :
				grade='F';
		}
		System.out.println("등급은 : "+grade+" 입니다.");
	}
}
