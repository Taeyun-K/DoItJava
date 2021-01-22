package chapter9.carexample;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿 메서드
	//작동 순서는 어느 차에서나 동일하며, 실행 순서를 정의한 메서드이다.
	final public void run() {
		startCar();
		drive();
		stop();
		wiper();
		turnOff();
	}
}
