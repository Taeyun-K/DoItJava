package innerclass;

class Outer2{
	// Methods
	Runnable getRunnable(final int i) {
		final int num = 100;
		
		return new Runnable() { // 익명 내부 클래스. Runnable 인터페이스 생성
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " +num);
			}
		};
	}
	
	// Variable(익명 내부 클래스를 변수에 대입)
	Runnable runner = new Runnable() {
			public void run() {
				System.out.println("Runnable이 구현된 익명 클래스 변수");
			}
	};
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		out.runner.run();
	}
}
