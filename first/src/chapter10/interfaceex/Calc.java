package chapter10.interfaceex;

public interface Calc {
	// 인터페이스에서 선언한 변수는 public static final 예약어를 쓰지 않아도 상수로 자동변환 
	double PI = 3.14;
	int ERROR = -99999999;

	// 인터페이스에서 선언한 함수는 public abstract 예약어를 명시적으로 쓰지 않아도 추상함수
	int add(int numq, int num2);
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// default method
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
		myMethod();	//디폴트 메서드에서 private메서드 호출
	}
	
	//static method
	static int total(int[] arr) {
		int total = 0;
		for(int i:arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다.");
	}
	
	
}
