package chapter8.inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer c1 = new Customer(10010, "이순신");
		c1.bonusPoint = 1000;
		
		VIPCustomer c2 = new VIPCustomer(10020, "김유신",12345);
		c2.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(c1.getCustomerName() + " 님이 지불해야 하는 금액은"
						   + c1.calcPrice(price)+"원입니다.");
		System.out.println(c2.getCustomerName() + " 님이 지불해야 하는 금액은 "
				   + c2.calcPrice(price)+"원입니다.");
		
		//묵시적 형 변환과 메스드 제정의
		Customer vc = new VIPCustomer(10030, 
				"나몰라", 2000);
		vc.bonusPoint = 1000;
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 "
				   + vc.calcPrice(price)+"원입니다.");
	}

}
