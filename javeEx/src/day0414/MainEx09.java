package day0414;

public class MainEx09 {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();	// 구현 완료한 메서드
		buyer.order();	// 오버라이딩(재정의) 완료한 메서드
//		buyer.print(); 	Customer의 타입 메서드
//		buyer.sell();   Sell의 타입 메서드
		
		Sell seller = customer;
		seller.sell();	// 구현 완료
		seller.order(); // 재정의 완료
//		seller.print(); customer의 타입 메서드
		
		if(seller instanceof Customer) {
			Customer cu = (Customer)seller;
			cu.print();
			cu.buy();
		}
	}
}
