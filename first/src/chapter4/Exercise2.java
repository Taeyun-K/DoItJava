package chapter4;

public class Exercise2 {

	public static void main(String[] args) {
		for(int i= 1; i<10; ++i) {
			
			if(i%2 != 0) continue;
			
			for(int j = 1; j<9; ++j) {
				System.out.print(i*j);
				System.out.print(' ');
			}
			System.out.println();
		}
	}

}
