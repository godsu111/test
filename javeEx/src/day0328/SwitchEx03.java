package day0328;

public class SwitchEx03 {
	public static void main(String[] args) {
		char ch = 'A';
		int a;
		switch (ch) {
			case 'A' :
				a=90;
				break;
			case 'B' :
				a=80;
				break;
			case 'C' :
				a=70;
				break;
			case 'D' :
				a=60;
				break;
			default:
				a=50;
		}
		System.out.println(a);
	}
}
