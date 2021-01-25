package chapter10.practice;

public interface Sort {
	public void ascending(int[] ary);
	public void descending(int[] ary);
	default public void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
		sortType();
	}
	public void sortType();
}
