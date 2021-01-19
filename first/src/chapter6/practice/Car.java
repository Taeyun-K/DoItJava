package chapter6.practice;

public class Car {
	static int statnum = 10000;
	int carnum;
	String carname = "unknown";
	String username = "unknown";
	
	Car(){
		statnum++;
		carnum = statnum;
	}
	public int getCarNum() {
		return carnum;
	}
}
