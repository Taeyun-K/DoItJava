package chapter8.polymorphism;
import java.util.ArrayList;

public class CustomerTestArray {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer c1 = new Customer(10010, "이순신");
		Customer c2 = new Customer(10020, "양희원");
		Customer c3 = new GoldCustomer(10030, "유진수");
		Customer c4 = new GoldCustomer(10040, "김혜민");
		Customer c5 = new VIPCustomer(10050, "최예민", 12345);
		
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		
		System.out.println("======= 고객 정보 출력 =========");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("======= 할인율과 보너스 포인트 계산 =======");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 "+cost+"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 "+
								customer.bonusPoint + "점입니다.");
		}
	}

}
