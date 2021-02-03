package stream;

public class TravelCustomer {
	//Variable
	private String name;
	private int age;
	private int price;
	
	//Constructor
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	//Method
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return "name: "+name +"age: "+age + "price: "+ price;
	}
}
