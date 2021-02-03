package innerclass;

class Outer2{
	// Methods
	Runnable getRunnable(final int i) {
		final int num = 100;
		
		return new Runnable() { // �͸� ���� Ŭ����. Runnable �������̽� ����
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " +num);
			}
		};
	}
	
	// Variable(�͸� ���� Ŭ������ ������ ����)
	Runnable runner = new Runnable() {
			public void run() {
				System.out.println("Runnable�� ������ �͸� Ŭ���� ����");
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
