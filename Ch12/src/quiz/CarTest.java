package quiz;

import java.util.HashMap;

class Car{
	String name;
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
}

class CarFactory{
	private static CarFactory instance = new CarFactory();
	private HashMap<String,Car> carMap = new HashMap<String,Car>();
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar(String name) {
		if (carMap.containsKey(name)){
			return carMap.get(name);
		}
		Car car = new Car(name);
		carMap.put(car.name, car);
		return car;
	}
}

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println(sonata1 == sonata2);
		
		Car avante1 = factory.createCar("태연 차");
		Car avante2 = factory.createCar("태연 차");
		System.out.println(avante1 == avante2);
		
		System.out.println(avante1 == sonata1);
	}

}
