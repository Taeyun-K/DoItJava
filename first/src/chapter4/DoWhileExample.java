package chapter4;

public class DoWhileExample {

	public static void main(String[] args) {
		int num=1;
		int sum=0;
		
		do {
			sum +=num;
			++num;
		} while(num<=0);
		
		System.out.println(num);
	}

}
