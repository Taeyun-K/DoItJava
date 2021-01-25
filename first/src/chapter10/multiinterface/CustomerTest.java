package chapter10.multiinterface;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Buy buyer = customer;
		buyer.buy();
		buyer.order();	//buy에서 정의한 디폴트 메서드가 아니라, customer의 override메서드 호출
		
		Sell seller = customer;
		seller.sell();
		seller.order();	//buy에서 정의한 디폴트 메서드가 아니라, customer의 override메서드 호출
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
			customer2.order();
		}
	}

}
