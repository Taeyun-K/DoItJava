package chapter10.practice;

public class HeapSort implements Sort {
	@Override
	public void ascending(int[] ary) {
		System.out.println("HeapSort ascending");		
	}

	@Override
	public void descending(int[] ary) {
		System.out.println("HeapSort descending");	
	}

	@Override
	public void sortType() {
		System.out.println("HeapSort입니다.");	
	}

}
