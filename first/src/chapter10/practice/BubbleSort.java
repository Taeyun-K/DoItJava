package chapter10.practice;

public class BubbleSort implements Sort{
	@Override
	public void ascending(int[] ary) {
		System.out.println("BubbleSort ascending");		
	}

	@Override
	public void descending(int[] ary) {
		System.out.println("BubbleSort descending");	
	}

	@Override
	public void sortType() {
		System.out.println("BubbleSort입니다.");	
	}

}
