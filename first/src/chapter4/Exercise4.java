package chapter4;

public class Exercise4 {

	public static void main(String[] args) {
		int i =0;
		for(; i<=3; i++) {
			int num = 2*i+1;
			for(int j =0 ; j<((7-num)/2); j++) System.out.print(' ');
			for(int k =0 ; k<num; k++) System.out.print('*');
			System.out.println();
		}
	}
}
