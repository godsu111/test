package day0414;

public interface Sell {
	// 추상 메서드
	void sell();
	
	// default 메서드
	default void order() {
		System.out.println("판매 주문");
	}
}
