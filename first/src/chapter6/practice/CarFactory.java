package chapter6.practice;

public class CarFactory {
	private static CarFactory carfac = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(carfac == null) {
			carfac = new CarFactory();
		}
		return carfac;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
