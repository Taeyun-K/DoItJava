package chapter6.practice;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonanta = factory.createCar();
		Car yourSonata = factory.createCar();
		System.out.println(mySonanta.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}
