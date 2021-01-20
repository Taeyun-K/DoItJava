package chapter7.arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		
		System.arraycopy(array1, 0, array2, 1, 4);	//복사하려는 개수가 붙여넣는 배열보다 길어지면 오류
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
