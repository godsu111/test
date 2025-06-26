package day0414;

public interface Buy {
	// 추상 메서드
	void buy();
	
	// default 메서드
	default void order() {
		System.out.println("구매 주문");
	}
}
