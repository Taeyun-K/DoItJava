package chapter8.polymorphism;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	//constructor	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	//methods
	@Override	//컴파일러에게 명확하게 알려주는 notation
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);	//할인된 가격을 계산하여 반환
	}
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}
}