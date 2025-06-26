package day0414;

public class Customer implements Buy, Sell{
	public void buy() {
		System.out.println("구매하기");
	}
	public void sell() {
		System.out.println("판매하기");
	}
	public void order() {	// default 메서드가 같을 경우 반드시 오버라이딩(재정의)하면 됨 
		System.out.println("고객 판매 주문");
	}
	public void print() {
		System.out.println("고객의 메서드");
	}
}
