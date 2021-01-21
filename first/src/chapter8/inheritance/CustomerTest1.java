package chapter8.inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustomerID(10010);
		c1.setCustomerName("이순신");
		c1.bonusPoint = 1000;
		System.out.println(c1.showCustomerInfo());
		
		VIPCustomer c2 = new VIPCustomer();
		c2.setCustomerID(10020);
		c2.setCustomerName("김유신");
		c2.bonusPoint = 10000;
		System.out.println(c2.showCustomerInfo());
	}
}
