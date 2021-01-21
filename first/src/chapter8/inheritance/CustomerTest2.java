package chapter8.inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		//VIPCustomer c1 = new VIPCustomer();
		VIPCustomer c1 = new VIPCustomer(10020, "김유신", 20010);
		c1.setCustomerID(10020);
		c1.setCustomerName("김유신");
		c1.bonusPoint = 10000;
		System.out.println(c1.showCustomerInfo());
	}

}
