package innerclass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(final int i) {
		final int num = 100;
		
		class MyRunnable implements Runnable{
			int localNum = 10;
			
			public void run() {
				//num = 200;	//���� ������ ����� �ٲ�Ƿ� ���� ������ �� ����
				//i = 100;		//�Ű������� ����� �ٲ�Ƿ� ���� ������ �� ����
				System.out.println("i =" + i);
				System.out.println("num = " +num);
				System.out.println("localNum = "+localNum);
				System.out.println("outNum = "+outNum);
				System.out.println("Outer.sNum = "+Outer.sNum);
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out= new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
