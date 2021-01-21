package chapter8.inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	//constructor
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	//디폴트 생성자가 없는 경우 명시적으로 생성자 써줘야 함
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	//methods
	public int getAgentID() {
		return agentID;
	}
	
	@Override	//컴파일러에게 명확하게 알려주는 notation
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);	//할인된 가격을 계산하여 반환
	}
}