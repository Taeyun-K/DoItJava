package chapter6.cooperation;

public class Taxi {
	int carNumber;
	int passengerCount;
	int money;
	
	//constructor
	public Taxi(int carNumber) {
		this.carNumber = carNumber;
	}
	
	//metods
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("택시"+carNumber+"번의 승객은"+passengerCount+"명이고, 수입은"+money+"입니다.");
	}
}