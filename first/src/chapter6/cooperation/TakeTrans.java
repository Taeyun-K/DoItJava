package chapter6.cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student sJames = new Student("James",5000);
		Student sTom = new Student("Tom",10000);
		Student sDaisy = new Student("Daisy", 20000);
		
		Bus bus100 = new Bus(100);
		sJames.takeBus(bus100);
		sJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		sTom.takeSubway(subwayGreen);
		sTom.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi8282 = new Taxi(8282);
		sDaisy.takeTaxi(taxi8282,10000);
		sDaisy.showInfo();
		taxi8282.showInfo();
	}
}
