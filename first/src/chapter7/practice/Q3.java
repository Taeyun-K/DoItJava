package chapter7.practice;

public class Q3 {

	public static void main(String[] args) {
		int[] arr = new int[] {2,4,6,8,10};
		int sum = 0;
		for(int i = 0; i < arr.length; ++i) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
