package chapter10.practice;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] ary) {
		System.out.println("QuickSort ascending");		
	}

	@Override
	public void descending(int[] ary) {
		System.out.println("QuickSort descending");	
	}

	@Override
	public void sortType() {
		System.out.println("QuickSort입니다.");	
	}

}
