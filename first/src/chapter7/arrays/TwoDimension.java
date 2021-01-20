package chapter7.arrays;

public class TwoDimension {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6}};
		
		for(int i = 0; i< arr.length; ++i) {
			for(int j = 0; j < arr[i].length; ++j) {
				System.out.println(arr[i][j]);
			}
			System.out.println();	//행 출력 끝난 후 한 줄 띄움
		}
		
		
		char[][] alphab = new char[13][2];
		char c = 'a';
		for(int i = 0 ; i<alphab.length; i++) {
			for(int j = 0; j < alphab[i].length; j++, c++)
			alphab[i][j] = c;
		}
		
		for(int i = 0 ; i<alphab.length; i++) {
			for(int j = 0; j < alphab[i].length; j++) {
			System.out.print(alphab[i][j]);
			}
			System.out.println();
		}
	}
}
