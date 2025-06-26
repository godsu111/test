package day0415;

interface Button {
	void onClick();
}

public class MainEx03 {
	public static void main(String[] args) {
		Button btn = new Button() {
			public void onClick() {
				System.out.println("버튼을 클릭했습니다.");
			}
		};
		btn.onClick();
	}
}
